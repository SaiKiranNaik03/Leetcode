class Solution {
    int fun(int idx, int nums[], int dp[]){
        if(idx == 0) return nums[idx];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];

        int pick  = nums[idx] + fun(idx-2,nums,dp);
        int notpick = 0 + fun(idx-1,nums,dp);

        return dp[idx] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return fun(n-1,nums,dp);
    }
}