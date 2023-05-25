package Exceptions;

public class CustomExceptionExample {
    public static void main(String[] args){
        System.out.println("something");
        method(15);
        System.out.println("something");
        
    }
    static void method(int age){
        if (age < 18){       //we have to throw the exception using keyword throw    
           throw new CustomException("You are under age");      
        }
    }
    
}
