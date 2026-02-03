class Solution {
    public static int getL(int nums[], int tar){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res=-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == tar){
               res = mid;
                high = mid-1; 
            }
            else if(nums[mid] > tar){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return res;
    }
    public static int getU(int nums[], int tar){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res=-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == tar){
                res = mid;
                low = mid+1;
            }
            else if(nums[mid] < tar){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{getL(nums,target), getU(nums,target)};
    }
}