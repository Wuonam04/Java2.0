package Self;

public class Sol {
    public static void main(String[] args){
        double Ar1[] = {3.5,7.9,0.0,-7.9,10.99,78.9,66.8,19.01,18.9,99.7};
        double Ar2[] = new double[5];
        double Ar3[] = new double[Ar1.length-Ar2.length];
        
        for(int i =0; i < Ar2.length; i++){
            Ar2[i] = Ar1[i];     //elements into the first array
        }
        for(int i = 0; i < Ar3.length; i++){
            Ar3[i] = Ar1[i+Ar2.length];   //the rest int the second array but starting from where the first array left off
        }
       for(double d : Ar3){
           System.out.print(d + ", ");
       }
    }
}
