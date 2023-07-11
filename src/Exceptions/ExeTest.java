package Exceptions;

public class ExeTest {
    public static void main(String[] args){
        int a,b,c;

       try{ a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        
        c = a/b;
        System.out.println(c);}
       catch(Exception e){
           System.out.println("divison by zero");
           System.out.println(e);
       }
    }
   
}
