class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j][0] = 0;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<=k;j++){
                dp[n][i][j] = 0;
            }
        }
        for(int idx=n-1;idx>=0;idx--){
            for(int buy=0;buy<2;buy++){
                for(int maxi=1;maxi<=k;maxi++){
                    int profit = 0;
                    if(buy == 1){
                        profit = Math.max(-prices[idx] + dp[idx+1][0][maxi] , 0 + dp[idx+1][1][maxi]);
                    }
                    else{
                        profit = Math.max(prices[idx] + dp[idx+1][1][maxi-1] , 0 + dp[idx+1][0][maxi]);
                    }
                    dp[idx][buy][maxi] = profit;
                }
            }
        }
        return dp[0][1][k];
    }
}