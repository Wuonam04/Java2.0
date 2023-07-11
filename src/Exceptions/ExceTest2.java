package Exceptions;

import java.util.Scanner;

public class ExceTest2 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a = scan.nextInt();
        System.out.println("Enter the second value: ");
        b =  scan.nextInt();
        try{ 
            c = a/b;
            System.out.println(c);}
        catch(Exception e){
            System.out.println("not an integer");
            System.out.println(e);
        }
        
    }
}
