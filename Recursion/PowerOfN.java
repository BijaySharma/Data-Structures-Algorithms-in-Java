public class PowerOfN {

    public static int pow(int a, int b){
        
        if(b == 0) return 1;
        if(b == 1) return a;
        
        int temp =  pow(a, b/2);
        
        if(b % 2 == 0){
            return temp * temp;
        }else{
            return a * temp * temp;
        }
    }


    public static void main(String[] args) {
        System.out.println(pow(5, 3));
    }
}
