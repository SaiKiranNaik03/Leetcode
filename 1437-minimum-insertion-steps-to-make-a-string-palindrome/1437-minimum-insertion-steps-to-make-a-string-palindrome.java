class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String s2 = "";
        for(int i=n-1;i>=0;i--) s2 += s.charAt(i);

        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
            dp[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }

        return n - dp[n][n];
    }
}