class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int c = 0;
        String res = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch =='('){
                if(c > 0) res+='(';
                c++;
            }else{
                c--;
                if(c > 0) res+=')';
            }
        }
        return res;
    }
}