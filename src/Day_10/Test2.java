package Day_10;

public class Test2 {
    public static void main(String[] args){
        int[] a = {0,2,3,1,3};
        for(int i = 0; i< a.length; i++){
            a[i] = a[(a[i] + 3) % a.length];
            System.out.print(a[i]);
        }
        //System.out.println(3 % 5);
    }
}
