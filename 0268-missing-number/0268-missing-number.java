class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total_sum=(n*(n+1))/2,array_sum=0;
        for(int num:nums){
            array_sum+=num;
        }
        return total_sum-array_sum;
        
        
    }
}