class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxi = 1;
        int c = 1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                c++;
            }else{
                c = 1;
            }
            maxi = Math.max(c,maxi);
        }
        return maxi;
    }
}