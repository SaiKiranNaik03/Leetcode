class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int c = 0;
        int maxi = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                c++;
            }else if(ch == ')'){
                maxi = Math.max(maxi, c);
                c--;
            }
        }
        return maxi;
    }
}