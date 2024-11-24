class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!stk.isEmpty() && k>0 && stk.peek() > ch){
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        while(k>0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}