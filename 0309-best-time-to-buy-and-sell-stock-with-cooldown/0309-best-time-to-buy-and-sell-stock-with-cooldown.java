class Solution {
    int fun(int idx, int buy, int prices[] , int n, int dp[][]){
        if(idx >= n) return 0;
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + fun(idx+1,0,prices,n,dp) , 0 + fun(idx+1,1,prices,n,dp));
        }else{
            profit = Math.max(prices[idx] + fun(idx+2,1,prices,n,dp) , fun(idx+1,0,prices,n,dp));
        }
        return dp[idx][buy] = profit;
    }
    // public int maxProfit(int[] prices) {
    //     int n = prices.length;
    //     int dp[][] = new int[n][2];
    //     for(int ro[] : dp) Arrays.fill(ro, -1);
    //     return fun(0,1,prices,n,dp);
    // }
    // Tabulation
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+2][2];
        dp[n][0] = 0;
        dp[n][1] = 0;
        for(int idx=n-1;idx>=0;idx--){
            for(int buy=0;buy<=1;buy++){
                int profit = 0;
                if(buy == 1){
                    profit = Math.max(-prices[idx] + dp[idx+1][0], 0 + dp[idx+1][1]);
                }else{
                    profit = Math.max(prices[idx] + dp[idx+2][1] , dp[idx+1][0]);
                }
                dp[idx][buy] = profit;
            }
        }
        return dp[0][1];
    }
}