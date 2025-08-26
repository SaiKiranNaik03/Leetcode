class Solution {
    boolean fun(int idx, int nums[], int dp[][], int sum){
        if(sum == 0) return true;
        if(idx == 0) return sum == nums[idx];
        if(dp[idx][sum] != -1) return dp[idx][sum] == 1? true : false;

        boolean notpick = fun(idx-1,nums,dp,sum);
        boolean pick = false;
        if(sum >= nums[idx]){
            pick = fun(idx-1,nums,dp,sum-nums[idx]);
        }
        dp[idx][sum] = pick || notpick? 1 : 0;
        return pick || notpick;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int ele : nums) sum += ele;
        if(sum%2 !=  0) return false;
        int dp[][] = new int[n][sum+1];
        for(int ro[] : dp) Arrays.fill(ro,-1);
        return fun(n-1,nums,dp,sum/2);
    }
}