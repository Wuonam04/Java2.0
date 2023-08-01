package Self;

public class Merge {
    public static void main(String[] args){
        double Ar1[] = {3.5,7.9,0.0,-7.9};
        double Ar2[] = {10.99,78.9,66.8,19.01,19.01,18.9,99.7};
        double Ar3[] = new double[Ar1.length + Ar2.length]; //MERGE THE  ARRAYS
        
        for(int i = 0; i < Ar1.length; i++){
            Ar3[i] = Ar1[i];
        }
        for(int i = 0; i < Ar2.length; i++){
            Ar3[i+ Ar1.length] = Ar2[i];    //the index in Ar3 is from where the first array stopped which is its length
        }
        for(double d : Ar3){
            System.out.print(d+", ");
        }
    }
}
