import java.lang.reflect.Array;

public class DoubleEndedQueue<T> {
    private static final int MAX_SIZE = 40;
    private T q[];
    private int front;
    private int rear;

    public DoubleEndedQueue(Class<T> clazz){
        q = (T[]) Array.newInstance(clazz, MAX_SIZE);
        front = rear = -1;
    }

    public static class QueueOverflowException extends Exception {}
    public static class QueueUnderflowException extends Exception {}

    public boolean isFull(){
        return (front == 0 && rear == q.length - 1) || (front == rear + 1);
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public void enqueueFront(T data) throws QueueOverflowException {

        if(isFull()){
            throw new QueueOverflowException();
        }else if(isEmpty()){
            front = rear = 0;
        }else if(front == 0){
            front = q.length - 1;
        }else {
            front --;
        }

        q[front] = data;
    }

    public T dequeueFront() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }

        T data = q[front];

        if(front == rear)
            front = rear = -1;
        else
            front = (front + 1) % q.length;

        return data;
    }

    public void enqueueRear(T data) throws QueueOverflowException {
        if(isFull()){
            throw new QueueOverflowException();
        }

        if(isEmpty()){
            front = rear = 0;
        }else {
            rear = (rear + 1) % q.length;
        }

        q[rear] = data;
    }


    public T dequeueRear() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException();

        T data = q[rear];

        if(front == rear){
            front = rear = -1;
        }else if(rear == 0){
            rear = q.length - 1;
        }else {
            rear --;
        }

        return data;
    }


}
