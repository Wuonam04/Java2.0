package Day_10;

public class Math2 extends Math1{;
    private double radius;
    private double height;
    
    Math2(double radius,double height){
        super(height);
        this.radius = radius;
        this.height = height;
    }
   
    public double surface(){
       return Math.PI * radius * radius; 
    }
    
    
}
