class Solution {
    int fun(int idx, int prev, int nums[], int dp[][]){
        if(idx == nums.length) return 0;
        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
        int nottake = 0 + fun(idx+1, prev,nums,dp);
        int take = 0;
        if(prev == -1 || nums[prev] < nums[idx]){
            take = 1 + fun(idx+1,idx,nums,dp);
        }
        return dp[idx][prev+1] = Math.max(take, nottake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int prev = -1;
        int dp[][] = new int[n][n+1];
        for(int ro[] : dp) Arrays.fill(ro,-1);
        return fun(0,prev,nums,dp);
    }
}