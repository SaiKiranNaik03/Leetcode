class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int a : arr){
            if(a > 0){
                stk.push(a);
            }
            else{
                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < -a){
                    stk.pop();
                }
                if(stk.isEmpty() || stk.peek() < 0){
                    stk.push(a);
                }
                if(stk.peek() == -a){
                    stk.pop();
                }
            }
        }
        int l = stk.size();
        int res[] = new int[l];
        int i = l-1;
        while(!stk.isEmpty()){
            res[i--] = stk.pop();
        }
        return res;
    }
}