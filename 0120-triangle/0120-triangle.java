class Solution {
    int fun(int i, int j, List<List<Integer>> triangle, int dp[][]){
        if(i==triangle.size()-1) return triangle.get(i).get(j);
        if(dp[i][j] != -1) return dp[i][j];

        int down = triangle.get(i).get(j) + fun(i+1,j,triangle,dp);
        int diag = triangle.get(i).get(j) + fun(i+1,j+1,triangle,dp);

        return dp[i][j] = Math.min(down, diag);
    }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n = triangle.size();
    //     int m = triangle.get(n-1).size();
    //     int dp[][] = new int[n][m];
    //     for(int ro[] : dp) Arrays.fill(ro,-1);
    //     return fun(0,0,triangle,dp);
    // }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int diag = triangle.get(i).get(j) + dp[i+1][j+1];

                dp[i][j] = Math.min(down,diag);
            }
        }
        return dp[0][0];
    }
}