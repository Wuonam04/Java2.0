package Exceptions;

public class FinallyExample {

    public static void main(String[] args) {

        Object obj = null;

        try {
            obj.toString();     //finally block will get executed regardless of this exception
        } catch (NullPointerException e) {
            e.printStackTrace();
        }finally{
            //Disconnect from DB
            //Release the system resource
            System.out.println("Finally block");
        }

    }
}
