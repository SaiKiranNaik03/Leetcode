class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int a : asteroids){
            if(a > 0) stk.push(a);
            else{
                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < -a) stk.pop();
                if(stk.isEmpty() || stk.peek() < 0) stk.push(a);
                else if(stk.peek() == -a) stk.pop();
            }
        }
        int len = stk.size();
        int res[] = new int[len];
        int i=len-1;
        while(!stk.isEmpty()){
            res[i--] = stk.pop();
        }
        return res;
    }
}