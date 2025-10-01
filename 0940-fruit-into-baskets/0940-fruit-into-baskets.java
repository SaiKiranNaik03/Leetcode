class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l=0;
        int maxi = 0;
        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            while(map.size() > 2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}