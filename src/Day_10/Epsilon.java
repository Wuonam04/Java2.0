package Day_10;

public class Epsilon {
    // test if two floating point numbers are the same by use of epsilon
    public static void main(String[] args){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        //creating a constant
        final double EPSILON = 1E-14; 
        
        if( Math.abs(x - 0.5) < EPSILON){System.out.println(x + " is approximately 0.5");}
        int number = 10;
        if(number % 2 == 0){System.out.println( number + " is even");}
        if(number % 5 == 0){System.out.println(number + " is a multiple of 5");}
}
}
