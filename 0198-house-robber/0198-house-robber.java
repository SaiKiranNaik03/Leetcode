
class Solution {
    public int rob(int[] num) {
        
        int n = num.length;
        if(n==0) return 0;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return solve(n-1,num,dp);
    }
    public int solve(int n, int [] num, int [] dp){
        
        if(n==0) return num[n];
        if(n<0) return 0;
        
        if(dp[n]!=-1) return dp[n];

        int pick = solve(n-2,num,dp)+ num[n];
        int nopick = solve(n-1,num,dp);

        return dp[n]= Math.max(pick,nopick);
    }
}
