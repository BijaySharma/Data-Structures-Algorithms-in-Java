public class Main {

    public static void main(String[] args) {
	    Stack<Integer> myStack = new Stack<>();

	    myStack.push(35);
	    myStack.push(63);
	    myStack.push(71);
	    myStack.push(84);

	    try{
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
        } catch (Stack.StackUnderflowException e){
            System.out.println(e.getMessage());
        }
    }
}
