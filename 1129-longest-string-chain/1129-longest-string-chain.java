
class Solution {
    boolean compare(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        if(m+1 != n) return false;
        int i=0;
        int j=0;
        while(i<n){
            if(j < m && s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return (i==n && j==m);
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int maxi = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(words[i], words[j]) && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        return maxi;
    }
}