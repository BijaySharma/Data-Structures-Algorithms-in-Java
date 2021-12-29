public class HarmonicProgression {
 
    /**
     * 
        PROBLEM STATEMENT:
        ------------------
        Implement a recursive method to find the sum of the Harmonic Progression given below.  
        1+1/2+1/3+1/4+1/5+1/6+…+1/n
        Implement the logic inside findHPSum() method. You need to find the sum based on the value of num passed to the method.
        E.g. - If the value of num is 3, you need to find the sum of 1+1/2+1/3.

        Sample Input = 3
        Expected Output = 1.8333333333333333
     */

     public static double findHPSum(int n){
         if(n == 1) return 1;

         return 1.0 / n + findHPSum(n-1);
     }

     public static void main(String[] args) {
         double sum = findHPSum(3);
         System.out.println(sum);
     }
}
