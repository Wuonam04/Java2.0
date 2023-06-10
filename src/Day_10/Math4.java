package Day_10;

public class Math4 extends Math1 {
    //pentagon volume
    private double radius;
    private double length;
    private double height;

    Math4(double radius, double length, double height) {
        super(height);
        this.radius = radius;
        this.length = length;
        this.height = height;
    }

        public double surface() {
            return (5 * this.length * this.radius) / 2;
        }

    }


    
