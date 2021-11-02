public class Main {

    public static void main(String[] args) {
	    CircularQueue<Integer> cq = new CircularQueue<>(Integer.class);

	    try{
            cq.enqueue(45);
            cq.enqueue(68);
            cq.enqueue(91);
            cq.enqueue(21);
            cq.enqueue(63);
        }catch (CircularQueue.QueueOverFlowException e){
            System.out.println("Failed to insert Queue is full");
        }

	    try {
            System.out.println(cq.dequeue());
            System.out.println(cq.dequeue());
            System.out.println(cq.dequeue());
            System.out.println(cq.dequeue());
            System.out.println(cq.dequeue());
            System.out.println(cq.dequeue());
        }catch (CircularQueue.QueueUnderFlowException e){
            System.out.println("Queue is empty");
        }

    }
}
