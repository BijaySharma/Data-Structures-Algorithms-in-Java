class Node{
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public void addAtBegining(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addAtEnd(int data){
        // Generic
        Node newNode = new Node(data);
        
        // Case 1 : When the list is empty
        if(head == null){
            head = newNode; 
            return;
        }

        // Case 2 : When the list is not empty
        Node p = head;
        while(p.getNext() != null){
            p = p.getNext();
        }

        p.setNext(newNode);
    }

    public void insert(int index, int data){
        Node newNode = new Node(data);
        
        // Case 1: Insert at Position 1
        if(index == 1){
            newNode.setNext(head);
            head = newNode;
            return;
        }

        // case 2: any other position
        int pos = 1;
        Node p = head;
        while(p != null && pos < index -1 ){
            pos++;
            p = p.getNext();
        }

        if(p != null && pos == index - 1){
            newNode.setNext(p.getNext());
            p.setNext(newNode);
        }else{
            System.out.printf("Invalid Index. Unable to insert at index position %d\n", index);
        }
    }

    public void reverse(){
      Node p, q = null , r = null;
      p = head;
      while(p != null){
        r = q;
        q = p;
        p = p.getNext();
        q.setNext(r);
      }
      head = q;
    }

    public void reverseRecursive(Node q, Node p){
      if(p == null){
        head = q;
        return;
      }

      reverseRecursive(p, p.getNext());
      p.setNext(q);
    }

    public int get(int index){
        // Case 1: If the list is empty
        if(head ==  null) return -1;

        // Case 2: If the list is not empty
        int pos = 1;
        Node p = head;
        while(pos < index && p != null){
            pos++;
            p = p.getNext();
        }

        if(p != null && pos == index)
            return p.getData();
        else   
            return -1;
    }

    public void display(){
        Node p = head;
        while(p != null){
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    public static void main(String ...args){
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(63);
        linkedList.addAtEnd(64);
        linkedList.addAtEnd(65);
        linkedList.addAtEnd(66);
        linkedList.reverseRecursive(null, linkedList.getHead());
        linkedList.display();
        System.out.println("Data at position 4 is " + linkedList.get(4));
    }
}
