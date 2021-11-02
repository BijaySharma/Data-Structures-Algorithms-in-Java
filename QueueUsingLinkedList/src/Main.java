public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        q.enqueue(68);
        q.enqueue(76);
        q.enqueue(21);
        q.enqueue(80);
        q.enqueue(91);

        try {
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
        } catch (Queue.QueueUnderflowException e){
            System.out.println(e.getMessage());
        }

    }
}
