class Solution {

    // public boolean isValid(String s) {
    //     Stack<Character> stk = new Stack<>();
    //     for(char ch : s.toCharArray()){
    //         if(ch == '(' || ch == '{' || ch == '['){
    //             stk.push(ch);
    //         }
    //         else{
    //             if(stk.isEmpty()){
    //                 return false;
    //             }
    //             char out = stk.pop();
    //             if((ch == ')' && out == '(') || (ch == ']' && out == '[') || (ch == '}' && out == '{')){
    //                 continue;
    //             }
    //             else{
    //                 return false;
    //             }
    //         }
    //     }
    //     return stk.isEmpty();
    // }

    public boolean isValid(String s){
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                stk.push('}');
            }
            else if(ch == '['){
                stk.push(']');
            }
            else if(ch == '('){
                stk.push(')');
            }
            else if(stk.isEmpty() || stk.pop() != ch){
                return false;
            }
        }
        return stk.isEmpty();
    }
}