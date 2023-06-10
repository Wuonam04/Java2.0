package Day_10;
import java.util.Scanner;
public class Table {
   public static void main(String[] args){
       int x = 0, y = 0, z = 0;
       System.out.print("Enter a number: ");
       Scanner input = new Scanner(System.in);
       double inp = input.nextDouble();
       System.out.print("Enter a new value: ");
       int New = input.nextInt();
       System.out.println(New);
       for(int i = 1;i <= inp; i++){
                x = i;
                y = i * i;
                z = i * i* i;
           System.out.println( " "+ x +" " + y + " "+z);
       }
       long card = 2345_2344_1223_1234L;
       int a = 6;
       int b = a++;
       System.out.println(a);
       System.out.println(b);
       System.out.println((int) 1.0 - 0.9);
   }
}
