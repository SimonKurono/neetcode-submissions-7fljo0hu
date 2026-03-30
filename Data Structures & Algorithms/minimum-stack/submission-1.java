class MinStack {
    Stack<Integer> stack;
    PriorityQueue<Integer> pq;

    public MinStack() {
        stack = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int i = stack.pop();
        if (getMin() == i) {
            pq.poll();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
