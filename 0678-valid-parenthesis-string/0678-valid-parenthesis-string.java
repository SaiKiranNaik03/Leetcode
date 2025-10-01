class Solution {
    public boolean checkValidString(String s) {
        int open,close;
        open = close = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
                close++;
            }else if(ch == ')'){
                open--;
                close--;
            }else{
                open++;
                close--;
            }
            if(open < 0) return false;
            if(close < 0) close = 0;
        }
        return close==0;
    }
}