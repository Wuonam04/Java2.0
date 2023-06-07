package I.O;
import java.io.*;

public class JAVAIO2 {
    
    public static void main(String[] args) throws IOException {
        FileInputStream fn = new FileInputStream("C:\\Users\\ODERA\\Desktop\\specailchars.txt"); //each character is no longer 1 byte. it could be 1-4byte
        InputStreamReader inr = new InputStreamReader(fn, "UTF-8"); //ARGUMENT PASSED IS FILEINPUT OBJECT
                                                           //CHANGE THE DEFAULT ENCODING on the constructor of the inputstream reader
        FileOutputStream fo = new FileOutputStream("C:\\Users\\ODERA\\Desktop\\todos_new");
        int i = 0;     //character reading rather than byte
        while((i = inr.read()) != -1){      //ignore BOM byte over mark
            System.out.println(i + ": " + (char)i); 
            fo.write(i);
        }
        fo.flush();
    }
   
}
