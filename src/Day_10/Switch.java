package Day_10;

public class Switch {
    public static void main(String[] args){
        int x = 3, y = 3;
        switch(x + 3){    //no break so default is executed either way
            case 6: y = 1; System.out.println(y);
            default: y += 1;System.out.println(y);
        }
    }
}
