public abstract class Pattern1 {
    
    /* 
    
    Print the following pattern without using any loops:
     
     *  *  *  *  * 
     *  *  *  * 
     *  *  * 
     *  * 
     *
     
    */

    public static void printPattern(int n, int i){
        if(n == 0) return;
        if(i < n){
            System.out.print(" * ");
            printPattern(n, i+1);
        }else{
            System.out.print("\n");
            printPattern(n-1, 0);
        }
    }
    
    public static void main(String[] args) {
        printPattern(5, 0);
    }
}
