public class Pattern2 {
    
    public static void printPattern(int n, int i){
        
        if(n == 0) return;
        
        if(i <= n){
            printPattern(n, i+1);
            System.out.print(" * ");
        }else{
            printPattern(n-1, 1);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }

}
