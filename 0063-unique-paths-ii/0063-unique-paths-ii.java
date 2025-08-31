class Solution {
    int fun(int i, int j, int grid[][], int dp[][]){
        if(i>=0 && j>=0 && grid[i][j] == 1) return 0;
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int up = fun(i-1,j,grid,dp);
        int left = fun(i,j-1,grid,dp);

        return dp[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for(int ro[] : dp) Arrays.fill(ro,-1);

        return fun(n-1,m-1,grid,dp);
    }
    // public int uniquePathsWithObstacles(int[][] grid) {
    //     int n = grid.length;
    //     int m = grid[0].length;
    //     int dp[][] = new int[n][m];
    //     dp[0][0] = 1;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             int up=0;
    //             int left=0;
    //             if(i==0 && j==0) continue;
    //             if(i > 0 && grid[i-1][j] != -1){
    //                 up = dp[i-1][j];
    //             }
    //             if(j>0 && grid[i][j-1] != -1){
    //                 left = dp[i][j-1];
    //             }
    //             dp[i][j] = up + left;
    //         }
    //     }
    //     return dp[n-1][m-1];
    // }
}