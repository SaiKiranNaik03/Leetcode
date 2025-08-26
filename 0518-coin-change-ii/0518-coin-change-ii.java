class Solution {
    int fun(int idx, int target, int coin[], int dp[][]){
        if(idx == 0){
            if(target%coin[idx] == 0)return 1;
            else return 0;
        }
        if(dp[idx][target] != -1) return dp[idx][target];
        int notpick = fun(idx-1, target, coin, dp);
        int pick = 0;
        if(coin[idx] <= target){
            pick = fun(idx,target-coin[idx],coin,dp);
        }
        return dp[idx][target] = pick + notpick;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int ro[] : dp) Arrays.fill(ro,-1);

        return fun(n-1,amount,coins,dp);
    }
}