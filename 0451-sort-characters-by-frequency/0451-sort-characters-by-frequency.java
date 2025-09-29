class Solution {
    public String frequencySort(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int alpha = s.charAt(i);
            map.put(alpha,map.getOrDefault(alpha,0)+1);
        }
        int n = map.size();
        int arr[][] = new int[n][2];
        int i=0;
        for(int key : map.keySet()){
            arr[i][0] = key;
            arr[i][1] = map.get(key);
            i++;
        }
        Arrays.sort(arr, (a,b) -> b[1] - a[1]);
        StringBuilder sb = new StringBuilder();
        for(int a[] : arr){
            char ch = (char)a[0];
            int cnt = a[1];
            sb.append(String.valueOf(ch).repeat(cnt));
        }
        return sb.toString();
    }
}