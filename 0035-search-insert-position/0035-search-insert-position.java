class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = n;
        while(low <= high){
            int mid  = (low + high)/2;
            if(nums[mid] >= target){
                res = mid;
                high = mid -1;
            }else low = mid + 1;
        }
        return res;
    }
}