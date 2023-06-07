package Intefaces;

public interface LandAnimal extends Animal {
    // implementing methods of the interface it inherits
     void breathing();
     default void Type(){
         System.out.println("This is a land animal.");
     }
     
     default void MakeNoise(){
         System.out.println("Making noise from land");  
     }
     
}
