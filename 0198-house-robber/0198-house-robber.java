class Solution {
    //momiazation
    // int fun(int idx, int nums[], int dp[]){
    //     if(idx == 0) return nums[idx];
    //     if(idx < 0) return 0;
    //     if(dp[idx] != -1) return dp[idx];

    //     int pick  = nums[idx] + fun(idx-2,nums,dp);
    //     int notpick = 0 + fun(idx-1,nums,dp);

    //     return dp[idx] = Math.max(pick,notpick);
    // }
    //tabuplation
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            int pick = nums[i];
            if(i-2 >= 0) pick += dp[i-2];
            int nonpick = dp[i-1];

            dp[i] = Math.max(pick , nonpick);
        }
        return dp[n-1];
    }
}