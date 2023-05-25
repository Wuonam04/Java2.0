package Self;

import java.util.ArrayList;

public class Arrange {
    public static void main(String[] args){
        //given an array, arrange in ascending order
        
        int [] array1 = {12,3,4,5,6,57,7888,65644,7797,8};
        Arrange obj = new Arrange();
        
        obj.Sorter(array1);
    }
    
    public void Sorter(int []d){
        ArrayList<Integer> array2 = new ArrayList<>();
        int least = 0;
        
        for(int i = 0; i < d.length; i++){
            for(int j = i + 1; j < d.length; j++){
                if(d[j] < d[i]){
                    least= d[j];
                    d[j]= d[i];
                    d[i] = least;
                }
            }
            array2.add(d[i]);
        }
        System.out.println("The sorted array is:" + array2);
        
    }
}
