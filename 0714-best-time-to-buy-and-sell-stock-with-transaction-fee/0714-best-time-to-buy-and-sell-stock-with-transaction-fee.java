class Solution {
    int fun(int idx, int buy, int fee, int prices[], int n, int dp[][]){
        if(idx == n) return 0;
        if(dp[idx][buy] != -1 ) return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + fun(idx+1,0,fee,prices,n,dp) , 0 + fun(idx+1,1,fee,prices,n,dp));
        }else{
            profit = Math.max(prices[idx] + fun(idx+1,1,fee,prices,n,dp) - fee, fun(idx+1,0,fee,prices,n,dp));
        }
        return dp[idx][buy] = profit ;
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int ro[] : dp) Arrays.fill(ro,-1);
        return fun(0,1,fee,prices,n,dp);
    }
}