class Solution {
    int fun(int idx1, int idx2, String s1, String s2, int dp[][]){
        if(idx1<0 || idx2<0) return 0;
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];

        if(s1.charAt(idx1) == s2.charAt(idx2)){
            return dp[idx1][idx2] = 1 + fun(idx1-1,idx2-1,s1,s2,dp);
        }else{
            return dp[idx1][idx2] =  Math.max(fun(idx1-1,idx2,s1,s2,dp),fun(idx1,idx2-1,s1,s2,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String s2 = "";
        for(int i=n-1;i>=0;i--) s2 += s.charAt(i);
        int dp[][] = new int[n][n];
        for(int ro[] : dp) Arrays.fill(ro,-1);
        return fun(n-1,n-1,s,s2,dp);
    }
}