package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception1 {
    

        public static void main(String[] args) {
            ExceptionTemp obj = new ExceptionTemp();

		/*System.out.println("something");
		System.out.println("something");
		method(null);              //exception here since you cant pass a null object to the method
		System.out.println("something");
		System.out.println("something");*/
            newMethRec(); 
        }

        static void newMethRec(){
            try {                                    //file might not be [resent so compiler throws a file not found exception
                FileReader file = new FileReader("C:\\Users\\ODERA\\Desktop ");
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //newMethRec();   //Method calling itself recursively leading to stack overflow
        }

        static void method(ExceptionTemp obj) {
            method2(obj);
        }

        static void method2(ExceptionTemp obj) {
            try {
                System.out.println(obj.example());
                System.out.println(obj.example());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
