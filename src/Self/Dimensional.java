package Self;

public class Dimensional {
    public static void main(String[] args){
        //compute the average of each row in multidimensional array and put he results in a new array
        double Ar1[][] = {
                {0.92,0.02,0.02,0.02,0.02},
                {0.02,0.02,0.32,0.32,0.32},
                {0.02,0.02,0.02,0.92,0.02},
                {0.92,0.02,0.02,0.02,0.02},
                {0.47,0.02,0.47,0.02,0.02}
                
        };
        double res[] = new double[Ar1.length];
        double av= 0;
        double sum =0;
        for(int i = 0; i< Ar1.length; i++){        //Ar1.length gives the row
            for(int j = 0; j < Ar1[0].length; j++){  //Ar[0].length gives the column
                 sum += Ar1[i][j];
                 res[i] = sum;
            }
            
        }
        for(double d: res){
            System.out.print(d + ", ");
        }
    }
}
