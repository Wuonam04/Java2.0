package Self;

public class Fibo {
    public static void main(String[] args){
        fibo(5);
    }
    static void fibo(int d){
        int one = 0;
        int two = 1;
        int sum =0;
        for(int i = 1; i <= d; i++){
            //System.out.print(one + ", ");
            
            sum = one + two;
            two = sum;
            sum = one;
            System.out.print(sum+".");
        }
        

    }
    
}
