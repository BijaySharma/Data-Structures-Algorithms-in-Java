import java.lang.reflect.Array;

public class CircularQueue<T> {
    private static final int MAX_SIZE = 40;
    private final T[] elements;

    private int headIndex = 0;
    private int tailIndex = 0;

    public CircularQueue(Class<T> clazz){
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public static class QueueOverFlowException extends Exception{
        public QueueOverFlowException(){
            super("Queue Overflow");
        }
    }
    public static class QueueUnderFlowException extends Exception{
        public QueueUnderFlowException(){
            super("Queue Under flow");
        }
    }

    public boolean isFull(){
        return (tailIndex + 1) % elements.length == headIndex;
    }

    public boolean isEmpty(){
        return headIndex == tailIndex;
    }

    public void enqueue(T data) throws QueueOverFlowException{
        if(isFull())
            throw new QueueOverFlowException();

        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;
    }

    public T dequeue() throws QueueUnderFlowException{
        if(isEmpty())
            throw new QueueUnderFlowException();

        headIndex = (headIndex + 1) % elements.length;
        T data = elements[headIndex];

        return data;
    }


}
