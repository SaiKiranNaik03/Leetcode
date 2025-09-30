class Solution {
    long getK(int k, int piles[]){
        long hrs =0;
        for(int p : piles){
            hrs += (long)Math.ceil((double)p/k);
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = -1;
        for(int p : piles) high = Math.max(high,p);

        while(low <= high){
            int mid = (low + high)/2;
            long res = getK(mid,piles);
            if(res <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}