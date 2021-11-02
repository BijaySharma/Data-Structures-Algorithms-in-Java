public class Queue<T>{
    private Node<T> head;
    private Node<T> tail;

    public Queue(){}

    public Queue(T data) {
        this();
        enqueue(data);
    }

    public static class QueueUnderflowException extends Exception {

        public QueueUnderflowException(String message){
            super(message);
        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T dequeue() throws QueueUnderflowException{
        if(isEmpty())
            throw new QueueUnderflowException("Queue Underflow");

        T data = head.getData();
        head = head.getNext();
        return data;
    }


}
