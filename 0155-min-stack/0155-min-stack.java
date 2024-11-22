class Pair{
    int x,y;
    Pair(int v1, int v2){
        this.x = v1;
        this.y = v2;
    }
}
class MinStack {
    Stack<Pair> stk;
    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(stk.isEmpty()){
            min = val;
        }else{
            min = Math.min(val,stk.peek().y);
        }
        stk.push(new Pair(val,min));
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.isEmpty()? -1 : stk.peek().x;
    }
    
    public int getMin() {
        return stk.isEmpty()? -1 :stk.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */