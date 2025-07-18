class Pair {
    char first;
    int second;

    Pair(char first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.second - a.second);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            char first = p.first;
            int second = p.second;
            while (second > 0) {
                sb.append(first);
                second--;
            }
        }
        return sb.toString();
    }
}