package Intefaces;

public interface WaterAnimal extends Animal {
    void breathing();

    default void Type(){ System.out.println("This is a water animal");}

     default void MakeNoise(){
        System.out.println("Making noise from water");
    }
}
