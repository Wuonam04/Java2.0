package Day_10;
import java.util.Scanner;
public class Driving {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        float distance = input.nextFloat();
        System.out.println("Enter fuel efficiency of the car: ");
        float efficiency = input.nextFloat();
        System.out.println("Enter the price per gallon:");
        float price = input.nextFloat();
        
        float drivingCost = (distance / efficiency) * price;
        
        System.out.println("The driving cost is: " + drivingCost);
        
        
    }
}
