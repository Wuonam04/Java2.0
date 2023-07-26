package Self;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    
    public static boolean reverse(int number){
        ArrayList<Integer> rev = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        while(number > 0){
            int q = number % 10;
            rev.add(q);
            number /= 10;
        }
        int i,b;
        for( i = 0; i <rev.size(); i++){
            System.out.print(rev.get(i) );
            n.add(rev.get(i));
            
        } 
        boolean pali;
            if(Arrays.equals(rev.toArray(),n.toArray())){
               pali = true;
            }
            else{
               pali = false;
            }
            
      
     return pali;
    }
    /*public static boolean isPali(int number){
        
        //return number == reverse(number);
    }*/
    public static void main(String[] args){
        System.out.println(reverse(81));
    }
}
