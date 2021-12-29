public class FibonacciSeries{
 
    /*
    Problem Statement:
        Implement a recursive method to generate the nth Fibonacci number.
        The Fibonacci series consists of the first two numbers as 0 and 1 and the subsequent numbers are the sum of the previous two numbers.
        Fibonacci numbers – 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, … 

        Sample Input = 6
        Expected Output = 5
    */

    public static int fib(int n){
        if(n <= 1) return 0;
        if(n == 2) return 1;

        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        int sum = fib(5);
        System.out.println(sum);
    }
}