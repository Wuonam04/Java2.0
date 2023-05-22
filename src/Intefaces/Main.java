package Intefaces;

public class Main {
    public static void main(String[] args) {
        Frog obj = new Frog();
        obj.breathing();
        obj.Type();
        obj.MakeNoise();

        MyCalculator obj2 = new MyCalculator();
        obj2.divisor_sum(100);
    }
}