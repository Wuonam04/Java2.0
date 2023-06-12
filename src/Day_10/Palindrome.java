package Day_10;
import java.util.Scanner;
import java.util.ArrayList;
public class Palindrome {
    // a number is palindrome if it reads the same from right to left and from left to right
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.print("ENTER NUMBER:");
        int[] number = new int[]{1,2,3};
        ArrayList<Integer> number1 = new ArrayList<>();
        int i;
        for (i = 0; i <= number.length - 1; i++) {
            //number.add(number[i]);
            //System.out.println(number[i]);
            int temp = number[number.length - 1];
            number[number.length - 1] = number[i];
            number[i] = temp;
            number1.add(number[i]);
            //System.out.println(number[i]);
        }
        //for(int i = 0; i <= number1.size() - 1; i++){
           // System.out.println(number1.get(i));
        //}
        System.out.println(number[i]);

    }
}
        