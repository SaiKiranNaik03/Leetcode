class Solution {
    int countPath(int i, int j, int n, int m , int[][] dp){
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i >= n || j >= m){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = countPath(i+1,j,n,m,dp) + countPath(i,j+1,n,m,dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return countPath(0,0,m,n,dp);
    }
}