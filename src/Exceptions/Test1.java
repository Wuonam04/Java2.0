package Exceptions;

import java.util.Scanner;

public class Test1 {
   
    
    public static void main(String[] args){
        //String Password = new String("Wuonam");
        CheckPass obj = new CheckPass();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password: ");
         int InPass = scan.nextInt();
        System.out.println(obj.getPassword());
        System.out.println(InPass);
         
         
       try {
           obj.CheckPass(InPass,obj.getPassword());
       }
       catch(Exception e){
           System.out.println("problem "+ e);
    }

        }
        
}
