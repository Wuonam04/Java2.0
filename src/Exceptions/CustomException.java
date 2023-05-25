package Exceptions;

public class CustomException extends RuntimeException {
    // to make class checked then extend exception and if you want to make a class unchecked then extend runtime exception
    
    CustomException(String s){
        super(s);    //changing the constructor to output whatever we want
    }
      
}
