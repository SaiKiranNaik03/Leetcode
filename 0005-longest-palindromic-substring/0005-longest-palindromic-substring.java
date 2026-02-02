class Solution {
    int getLen(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int start, end;
        start = end = 0;
        int maxi = 0;
        for(int i=0;i<n;i++){
            int even = getLen(s,i,i+1);
            int odd = getLen(s,i,i);
            maxi = Math.max(odd, even);
            if(maxi > end - start){
                start = i - (maxi - 1)/2;
                end = i + maxi/2 + 1;
            }
        }
        return s.substring(start,end);
    }
}