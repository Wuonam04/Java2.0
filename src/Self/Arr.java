package Self;

public class Arr {
    public static void main(String[] args){
        int arr[] = {4,1,2,6,10,21,4,3};
        for(int i = 0; i < arr.length; i++){
            for(int j= i+1; j <arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int q : arr){
            System.out.print(q+ ", ");
        }
    }
}
