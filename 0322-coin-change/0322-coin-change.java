class Solution {
    int fun(int idx, int[] coins, int amt, int dp[][]){
        if(idx == 0){
            if(amt % coins[0] == 0) return amt / coins[0];
            return Integer.MAX_VALUE;
        }
        if(dp[idx][amt] != -1) return dp[idx][amt];
        int notPick = fun(idx - 1, coins, amt,dp);

        int pick = Integer.MAX_VALUE;
        if(coins[idx] <= amt){
            int res = fun(idx, coins, amt - coins[idx],dp);
            if(res != Integer.MAX_VALUE){
                pick = 1 + res;
            }
        }

        return dp[idx][amt] = Math.min(pick, notPick);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int ro[] : dp) Arrays.fill(ro,-1);
        int ans = fun(n - 1, coins, amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
