class Solution {
    public String reorganizeString(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.add(new int[]{freq[i], i});
        }

        StringBuilder sb = new StringBuilder();
        int[] prev = {0, -1};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            sb.append((char) (curr[1] + 'a'));
            curr[0]--;

            if (prev[0] > 0) pq.add(prev);
            prev = curr;
        }

        return sb.length() == str.length() ? sb.toString() : "";
    }
}