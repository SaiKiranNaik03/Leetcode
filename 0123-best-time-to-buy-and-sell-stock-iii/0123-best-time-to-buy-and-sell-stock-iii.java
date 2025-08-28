class Solution {
    int fun(int idx, int buy, int prices[], int n, int maxi,int dp[][][]){
        if(maxi== 0 || idx == n) return 0;
        if(dp[idx][buy][maxi] != -1) return dp[idx][buy][maxi];
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-prices[idx] + fun(idx+1,0,prices,n,maxi,dp) , 0 + fun(idx+1,1,prices,n,maxi,dp));
        }
        else{
            profit = Math.max(prices[idx] + fun(idx+1,1,prices,n,maxi-1,dp) , 0 + fun(idx+1,0,prices,n,maxi,dp));
        }
        return dp[idx][buy][maxi] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = 2;
        int dp[][][] = new int[n+1][2][maxi+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                Arrays.fill(dp[i][j], -1);
        
        return fun(0,1,prices,n,maxi,dp);
    }
}