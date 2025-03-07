class MyQueue {
    Stack<Integer> stack1 = new Stack<>(); 
    Stack<Integer> stack2 = new Stack<>(); 

    public MyQueue() {
              
    }
    
    public void push(int x) {
        for( ; !stack1.isEmpty(); ){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        for(; !stack2.isEmpty(); ){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
       return stack1.pop(); 
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        if(stack1.isEmpty()){
          return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */