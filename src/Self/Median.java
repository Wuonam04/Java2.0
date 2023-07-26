package Self;
import java.util.ArrayList;
import java.util.Collections;
public class Median {
 public static void main(String[] args){
     //given 2 sorted arrays return the median of the 2 arrays
     int[] a = {};
     int b[] = {1};
     //int c[] = new int [a.length + b.length - 2];
     ArrayList <Integer> c = new ArrayList<>(a.length + b.length - 1);
     if(a.length > 0){ //check for when array a is empty
     for(int i = 0; i < a.length; i++){
         c.add(a[i]);           //adding elements of the first array to the array list
    }
     for(int i = 0;i < c.size(); i++){
         for(int j = i; j< b.length; j++) {     //adding the other array to the arraylist
             if (b[j] == c.get(i)) {
                 c.add(i + 1, b[j]);
             } else {
                 c.add(b[j]);
             }
             break;
         }
     }}
     else{     //when only array 2 has values
         for(int i = 0; i < b.length; i++){
             c.add(b[i]);
         }
     }
     Collections.sort(c);     //inbuilt sorting for arrays
     for(int d : c){
         System.out.print(d + ", ");   //printing out
         }
     double median = 0;
     int div = c.size() / 2;   //divide by 2 to get the index that i want which is this and index before it
     if(c.size() /2 > 0){
     if(c.size() % 2 == 0){
         median = ((double) (c.get(div - 1) + c.get(div)) /2); //median
     }
     
     else{
         median = c.get(div); //for size none divisible by 2, this value is the median value
     }}
     else{
         median = 0;}
    
     System.out.println("The median is " + median);
     }
}
