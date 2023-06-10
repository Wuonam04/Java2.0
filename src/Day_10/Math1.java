package Day_10;

public abstract class Math1 {
    private double height;
    
    Math1(double height){
        this.height = height;
    }
    
    public double volume(){
        return surface() * height;
    }
    //TODO please add the new function ASAP
    public abstract double surface();
}
