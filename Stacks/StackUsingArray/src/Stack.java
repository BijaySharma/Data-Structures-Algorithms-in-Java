import java.lang.reflect.Array;

public class Stack<T> {
    private static final int MAX_SIZE = 10;
    private int top = -1;
    private T[] stack;

    public Stack(Class<T> clazz){
        stack = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public static class StackOverflowException extends Exception{
        public StackOverflowException(String message){
            super(message);
        }
    }

    public static class StackUnderflowException extends Exception{
        public StackUnderflowException(String message){
            super(message);
        }
    }

    public boolean isFull(){
        return top == MAX_SIZE - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T data) throws StackOverflowException{
        if(isFull())
            throw new StackOverflowException("Cannot add element, Stack Overflow");

        stack[++top] = data;
    }

    public T pop() throws StackUnderflowException {
        if(isEmpty())
            throw new StackUnderflowException("Stack Underflow");

        return stack[top--];
    }

    public T peek() throws StackUnderflowException {
        if(isEmpty())
            throw new StackUnderflowException("Stack is Empty");
        return stack[top];
    }

}
