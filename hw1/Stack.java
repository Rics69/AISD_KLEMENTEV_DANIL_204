import java.util.Arrays;

public class Stack {
    private int[] stack;
    private int current;

    public Stack(){

    }

    public Stack(int size){
        stack = new int[size];
        current = -1;
    }

    public void add(int elem){
        current++;
        stack[current] = elem;
    }

    public int getFirst() throws Exception {
        if(current != -1){
            int a = stack[current];
            current--;
            return a;
        }else{
            throw new Exception("Stack is empty");
        }
    }

    public boolean isEmpty(){
        return current == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                ", current=" + current +
                '}';
    }
}