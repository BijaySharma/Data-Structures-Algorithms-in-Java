public class Main {

    public static void main(String[] args) {
	    Stack<Integer> myStack = new Stack<>(Integer.class);

	    // Insert
        try{
            myStack.push(25);
            myStack.push(32);
            myStack.push(81);
            myStack.push(96);
            myStack.push(73);
            myStack.push(64);
            myStack.push(91);
        } catch (Stack.StackOverflowException e){
            System.out.println(e.getMessage());
        }

        // Pop
        try{
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());

        } catch (Stack.StackUnderflowException e){
            System.out.println(e.getMessage());
        }

    }
}
