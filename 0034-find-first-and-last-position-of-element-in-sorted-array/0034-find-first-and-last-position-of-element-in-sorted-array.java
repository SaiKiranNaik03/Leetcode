class Solution {
    public int first(int nums[], int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else low = mid +1;
        }
        return res;
    }
    public int last(int nums[], int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid +1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int fst = first(nums,target);
        if(fst == -1) return new int[] {-1,-1};
        int lst = last(nums,target);
        return new int[] {fst, lst};
    }
}