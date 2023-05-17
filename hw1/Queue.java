public class Queue {
    private Stack stack1;
    private Stack stack2;

    public Queue(Stack stack1, Stack stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }
    public Queue(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public boolean add(int elem){
        stack1.add(elem);
        return true;
    }

    public int getFirst() throws Exception {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.add(stack1.getFirst());
            }
        }
        return stack2.getFirst();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}