public class PartyProblem {
    /* 
    Problem Statement: 
    There are N persons who want to go to a party there is a constraint that any person can either go alone  or can go in a pair. Calculate the no. of ways in which N persons will got to the party.

    Example:
    for N = 3
    Let the three persons be A, B, C respectively.
    No. of ways these three people can go are:
    {A} {B} {C} -> 1st way
    {A, B} {C}  -> 2nd way
    {A, C} {B}  -> 3rd way
    {B, C} {A}  -> 4th way
    
    Therefore 3 persons {A, B, C} can go in 4 different ways in a party.

    Sample Test Case:
    Input = 3
    Output = 4


    */

    public static int calulateWays(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        return calulateWays(n-1) + (n-1) * calulateWays(n-2);
    }

    public static void main(String[] args) {
        int n = 3;
        int w = calulateWays(n);
        System.out.println(n + " Persons can go in "+  w + " ways in the party.");
    }
}
