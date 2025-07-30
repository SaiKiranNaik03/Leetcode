class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        int[][] arr = new int[hm.size()][2];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            arr[i][0] = (int) entry.getKey();    
            arr[i][1] = entry.getValue();       
            i++;
        }
        Arrays.sort(arr,(a,b) -> b[1] - a[1]);        
        StringBuilder result = new StringBuilder();
        for(int a[] : arr){
            char ch =(char)a[0];
            int cnt = a[1];
            result.append(String.valueOf(ch).repeat(cnt));
        }
        
        return result.toString();
    }
}

