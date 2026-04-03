class Solution {
    long getH(int piles[], int cap){
        long hrs = 0;
        for(int p : piles){
            hrs += (long)Math.ceil((double)p/cap);
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low=1;
        int high=-1;
        for(int p : piles) high = Math.max(high,p);

        while(low <= high){
            int mid = (low+high)/2;
            long hrs = getH(piles,mid);
            if(hrs <= (long)h) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}