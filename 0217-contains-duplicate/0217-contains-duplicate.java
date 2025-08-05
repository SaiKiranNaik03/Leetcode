class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}