class Solution {
    // int fun(int idx1, int idx2, String s1, String s2, int dp[][]){
    //     if(idx1 < 0 || idx2 < 0) return 0;
    //     if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
    //     int notmatch = 0;
    //     int match = 0;
    //     if(s1.charAt(idx1) == s2.charAt(idx2)){
    //         return dp[idx1][idx2] = 1 + fun(idx1-1, idx2-1,s1,s2,dp);
    //     }else{
    //         return dp[idx1][idx2] = (Math.max(fun(idx1-1,idx2,s1,s2,dp) , (fun(idx1,idx2-1,s1,s2,dp))));
    //     }
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        // int n = text1.length();
        // int m = text2.length();
        // int dp[][] = new int[n][m];
        // for(int ro[] : dp) Arrays.fill(ro,-1);
        // return fun(n-1,m-1,text1,text2,dp);

        // tabulation
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++) dp[i][0] = 0;
        for(int i=0;i<=m;i++) dp[0][i] = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}