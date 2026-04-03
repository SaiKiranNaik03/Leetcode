class Solution {
    int getV(int nums[], int div){
        int res = 0;
        for(int n : nums){
            res += (int)Math.ceil((double)n/div);
        }
        return res;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int n : nums) high = Math.max(high,n);

        while(low <= high){
            int mid = (low+high)/2;
            int res = getV(nums,mid);

            if(res > threshold) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
}