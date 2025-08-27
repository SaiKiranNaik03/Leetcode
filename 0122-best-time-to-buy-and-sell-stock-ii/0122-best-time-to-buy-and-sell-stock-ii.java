class Solution {
    int fun(int idx, int buy, int n, int price[], int dp[][]){
        if(idx == n) return 0;
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-price[idx] + fun(idx+1,0,n,price,dp), 0 + fun(idx+1,1,n,price,dp));
        }else{
            profit = Math.max(price[idx] + fun(idx+1,1,n,price,dp) , 0 + fun(idx+1,0,n,price,dp));
        }
        return dp[idx][buy] = profit;
    }
    // public int maxProfit(int[] prices) {
    //     int n = prices.length;
    //     int dp[][] = new int[n][2];
    //     for(int ro[] : dp) Arrays.fill(ro,-1);
    //     return fun(0,1,n,prices,dp);
    // }
    // Tabulation
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2];
        dp[n][0] = 0;
        dp[n][1] = 0;
        for(int idx=n-1;idx>=0;idx--){
            for(int buy=0;buy<=1;buy++){
                int profit = 0;
                if(buy == 1){
                    profit = Math.max(-prices[idx] + dp[idx+1][0], 0 + dp[idx+1][1]);
                }else{
                    profit = Math.max(prices[idx] + dp[idx+1][1] , 0 + dp[idx+1][0]);
                }
                dp[idx][buy] = profit;
            }
        }
        return dp[0][1];
    }
}