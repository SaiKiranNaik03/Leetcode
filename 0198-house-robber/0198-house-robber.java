class Solution {
    int fun(int n, int nums[], int dp[]){
        if(n < 0) return 0;
        if(n == 0) return nums[n];
        if(dp[n] != -1) return dp[n];
        int pick,notPick;
        pick = notPick = Integer.MIN_VALUE;
        pick = fun(n-2,nums,dp) + nums[n];
        notPick = fun(n-1,nums,dp) + 0;

        return dp[n] = Math.max(pick, notPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return fun(n-1,nums,dp);
    }
}