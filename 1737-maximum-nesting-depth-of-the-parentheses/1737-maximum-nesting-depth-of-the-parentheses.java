class Solution {
    public int maxDepth(String s) {
        int c=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') c++;
            else if(ch == ')'){
                maxi = Math.max(maxi,c);
                c--;
            }
        }
        return maxi;
    }
}