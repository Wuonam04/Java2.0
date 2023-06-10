package Day_10;

public class Math3 extends Math1{
    //cuboid
    private double height;
    private double width;
    private double length;
    Math3(double length, double width, double height){
        super(height);
        this.length = length;
        this.width = width;
    }
    public double surface(){
        return length * width;

    }
}
