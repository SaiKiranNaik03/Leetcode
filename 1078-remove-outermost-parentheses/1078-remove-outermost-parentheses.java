class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String res = "";
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ')') c--;
            if(c != 0) res += ch;
            if(ch =='(') c++;
        }
        return res;
    }
}