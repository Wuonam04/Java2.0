package Inheritance;

public class Test {
    public static void main(String[] args) {
        Surface obj = new Surface();
        System.out.println(obj.Area(2, 67));
        System.out.println(obj.Area(2));


        Child Chi = new Child();
        Chi.Meth1();
        SurfaceUpdate obj3 = new SurfaceUpdate();
        System.out.println(obj3.Area(7));
        System.out.println(obj3.Area(12,34));
        
        
        
        
    }
}
