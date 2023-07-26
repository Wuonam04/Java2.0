//Deepak 
package Self;
import java.util.ArrayList;

public class Module extends Student{
    private String name;
    private int id;
    private String cour;
    ArrayList<Object> course = new ArrayList<>();

    Module(String name, int id) {
        super(name, id);
    }
    Module(String name, String cour){
        super();
        this.name = name;
        this.cour = cour;
    }

    public ArrayList<Object> addCourse(){
        course.add(this.name);
        course.add(this.cour);
        return course;
    }
    public void printInfo(){
        System.out.println("Student name" + this.name + "id" + this.id);
        for(int i = 1; i < course.size(); i ++){
                System.out.println(" course name: " + course.get(i)  );
            }
        }
        
        public static void main(String[] args){
          Module obj1 = new Module("John David", 12001);
            Module obj = new Module("John David", "Mathematic");
            Module obj2 = new Module("John David", "Programming");
            Module obj3 = new Module("John David", "Management Basics");
            Module obj4 = new Module("John David", "English");
            
            obj.addCourse();
            obj2.addCourse();
            obj3.addCourse();
            obj4.addCourse();
            obj.printInfo();
            

        }
}

