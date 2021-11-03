public class Stack<T> {
    private Node<T> top;

    public static class StackUnderflowException extends Exception {
        public StackUnderflowException(String message) {
            super(message);
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        Node<T> newNode = new Node(data);

        newNode.setNext(top);
        top = newNode;
    }

    public T pop() throws StackUnderflowException{
        if(isEmpty())
            throw new StackUnderflowException("Stack is Empty.");

        Node<T> temp = top;
        top = top.getNext();
        return temp.getData();
    }

    public T peek() throws StackUnderflowException {
        if(isEmpty())
            throw new StackUnderflowException("Stack is Empty.");

        return top.getData();
    }
}
