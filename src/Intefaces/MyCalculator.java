package Intefaces;

 public class MyCalculator implements Test1 {
     public void divisor_sum(int n) {
         int sum = 0;
         if (n <= 1000) {
             for (int i = 1; i <= n; i++) {
                 if (n % i == 0) {
                     sum += i;
                 }
             }
             System.out.println("The sum of all divisors is: " + sum);
         }else{System.out.println("Out of range");}
     }
 }

