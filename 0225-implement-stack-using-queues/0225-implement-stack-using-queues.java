class MyStack {
    Queue<Integer> qt1;
    Queue<Integer> qt2;
    
    public MyStack() {
        qt1 = new ArrayDeque<>();
       qt2 = new  ArrayDeque<>();
    }
    
    public void push(int x) {
        
        qt2.add(x);
        
        while (!qt1.isEmpty()) {
            qt2.offer(qt1.poll());
        }
        
        Queue<Integer> temp = qt1;
        
        qt1 = qt2;
        
        qt2 = temp;
    }
    
    public int pop() {
        return qt1.poll();
    }
    
    public int top() {
        return qt1.peek();
    }
    
    public boolean empty() {
        return qt1.isEmpty();
    }
}