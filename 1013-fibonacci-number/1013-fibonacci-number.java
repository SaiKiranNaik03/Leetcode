class Solution {
    int fun(int n , int dp[]){
        if(n == 0)  return 0;
        if(n == 1) return 1;

        if(dp[n] != 0) return dp[n];

        return dp[n] = fun(n-1,dp) + fun(n-2,dp);
    }
    public int fib(int n) {
        int dp[] = new int[n+1];
        return fun(n,dp);
    }
}