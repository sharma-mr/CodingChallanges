class MinStack {

    Stack<StackPair> stack;
    
    
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        
        if(stack.isEmpty()) {
            
            stack.push(new StackPair(x,x));
        } else {
            
            int currentMinInStack = stack.peek().currentMin;
            stack.push(new StackPair(x, Math.min(x, currentMinInStack)));
        }
        
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        
        return stack.peek().currentMin;
    }
    
    class StackPair {
        
        int val;
        int currentMin;
        
        StackPair(int val, int currentMin) {
            this.val = val;
            this.currentMin = currentMin;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */