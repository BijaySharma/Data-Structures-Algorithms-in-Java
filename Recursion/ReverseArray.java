public class ReverseArray {

    /*
    Problem Statement:
    ------------------
        Implement a recursive method to reverse an array based on the array, the start index and the end index of the array.
        Implement the logic inside reverseArray() method.

        Sample Input = {1, 2, 3, 4, 5, 6}
        Expected Output = {6, 5, 4, 3, 2, 1}
    */

    public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return numbers;
        }
        
        int temp = numbers[startIndex];
        numbers[startIndex] = numbers[endIndex];
        numbers[endIndex] = temp;
        
        return reverseArray(numbers, startIndex + 1, endIndex - 1);
    }

    public static void main(String[] args) {
        int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };

        int reversedNumbers[] = reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
