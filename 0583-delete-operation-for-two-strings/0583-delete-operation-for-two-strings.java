class Solution {
    int fun(int idx1, int idx2, String s1, String s2, int dp[][]){
        if(idx1 < 0 || idx2 < 0) return 0;
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        int match=0;
        int notmatch = 0;
        if(s1.charAt(idx1) == s2.charAt(idx2)){
            match = 1 + fun(idx1-1, idx2-1, s1, s2, dp);
        }else{
            notmatch = 0 + Math.max(fun(idx1-1, idx2,s1,s2,dp) , fun(idx1,idx2-1,s1,s2,dp));
        }
        return  dp[idx1][idx2] = match + notmatch;
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for(int ro[] : dp) Arrays.fill(ro, -1);
        int res = fun(n-1,m-1,word1,word2,dp);
        return (n+m) - 2*res;
    }
}