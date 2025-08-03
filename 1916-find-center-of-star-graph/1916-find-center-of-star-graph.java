class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ed[] : edges){
            map.put(ed[0],map.getOrDefault(ed[0],0)+1);
            map.put(ed[1],map.getOrDefault(ed[1],0)+1);
        }

        int mid = -1;
        for(int k : map.keySet()){
            if(map.get(k) > mid){
                mid = k;
            }
        }
        return mid;
    }
}