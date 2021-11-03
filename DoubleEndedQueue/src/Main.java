public class Main {

    public static void main(String[] args) {
        DoubleEndedQueue<Integer> dq = new DoubleEndedQueue<>(Integer.class);
        try {
            dq.enqueueFront(45);
            dq.enqueueFront(68);
            dq.enqueueFront(71);
            dq.enqueueRear(76);
            dq.enqueueRear(78);
            dq.enqueueFront(42);

            System.out.println(dq.dequeueFront());
            System.out.println(dq.dequeueRear());
            System.out.println(dq.dequeueFront());
            System.out.println(dq.dequeueFront());
            System.out.println(dq.dequeueRear());
            System.out.println(dq.dequeueRear());
            System.out.println(dq.dequeueRear());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
