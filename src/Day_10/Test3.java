package Day_10;

public class Test3 {
    public static void main(String[] args){
        Test3  p = new Test3();
        p.start();
        
    }
    void start(){
        String s1 = "Slip";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }
    String fix(String s1){
        s1 = s1 + "Stream";
        System.out.print(s1 + " ");
        return "Stream";
    }
}
