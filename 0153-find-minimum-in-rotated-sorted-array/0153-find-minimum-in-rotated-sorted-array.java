class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int min_ele=Integer.MAX_VALUE;
        while(low <= high){
            int mid =(low+high)/2;
            if(nums[low] <= nums[mid]){
                if(nums[low] < min_ele){
                    min_ele=nums[low];
                }
                low=mid+1;
            }
            else{
                if(nums[mid] < min_ele){
                    min_ele=nums[mid];
                }
                high=mid-1;
            }
        }
        return min_ele;
    }
}