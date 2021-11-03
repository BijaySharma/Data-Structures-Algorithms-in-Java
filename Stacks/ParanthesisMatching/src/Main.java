import java.util.Scanner;

public class Main {

    public static boolean isBalanced(String expression){
        Stack<Character> st = new Stack<>();
        char[] arr = expression.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                st.push(arr[i]);
            } else if(arr[i] == ')'){
                try{
                    st.pop();
                } catch (Stack.StackUnderflowException e){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an expression: ");
        String expression = sc.nextLine();

        if(isBalanced(expression))
            System.out.println("Expression is Balanced");
        else
            System.out.println("Expression is not Balanced");

    }
}
