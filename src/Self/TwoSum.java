package Self;

import java.util.ArrayList;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //int[] num = nums;
        ArrayList<Integer> n = new ArrayList<>();
        int t = target;
        int ar[] = new int[2];    //result array of length 2
       
            for (int i = 0; i < nums.length; i++) {    //checking at a particular index plus all the other values
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == t - nums[i] ) {
                        //n.add(i);
                  /*  ar[0] = nums[i];  // this was to put in the numbers but we want the indexes
                    ar[1] =nums[j];*/
                        ar[0] = i;
                        ar[1] = j;

                    }

                }
            }
      
            
       for(int d : ar) {
        System.out.print(d + ", ");}
        return ar;
        }
public static void main(String[] args){
        int b[] = {2,2,67,5,6,90};
        int target = 92;
        TwoSum obj = new TwoSum();
        obj.twoSum(b,target);
}
    
}
