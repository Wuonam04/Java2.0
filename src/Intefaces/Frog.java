package Intefaces;

public class Frog implements LandAnimal,WaterAnimal {
    //CLASS CREATED TO SHOW HYBRID INHERITANCE THAT IS A CLASS CAN INHERIT FROM TWO RATHER THAN ONE

    //so as not to make the class abstract or implement the abstract method breathing or any other method
    @Override
    public void breathing(){System.out.println("This animal can breath in water and on land.");}

    @Override
    public void Type() { System.out.println("This is an amphibian");}

    @Override
    public void MakeNoise(){ //Land Animal and water animal both have method with same name using super to solve
        WaterAnimal.super.MakeNoise();
    }
}
