package Day_10;
import java.util.Scanner;
public class Two {
    //generate two random numbers from unix epoch and ask user for their summation results
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
        
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int d = number1 + number2;
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        System.out.println( number1 + " + " + number2 + " = " + answer + " " + (d == answer));
        
    }
}
