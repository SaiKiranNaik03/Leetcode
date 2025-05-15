class Solution {
    static int findMax(int arr[]){
        int maxi = arr[0];
        for(int el : arr){
            if(el > maxi){
                maxi = el;
            }
        }
        return maxi;
    }
    static long findTime(int arr[], int limit){
        long totalTime=0;
        for(int bn : arr){
            totalTime += (long)Math.ceil((double)bn / limit);
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = -1;
        while(low <= high){
            int mid =(low+high)/2;
            long time = findTime(piles,mid);
            if(time <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }
}