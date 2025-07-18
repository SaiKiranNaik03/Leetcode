class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(ch);
            }
            else {
                if(!stk.isEmpty() && stk.peek() == '('){
                    stk.pop();
                    continue;
                }else{
                    c++;
                }
            }
        }
        c+=stk.size();
        return c;
    }
}