package I.O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JAVAIO1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\ODERA\\Desktop\\todos.txt"); //file input stream
        //checked exception, possibility if file not being present. so we do try catch block or throws

        FileOutputStream out = new FileOutputStream("C:\\Users\\ODERA\\Desktop\\todos_new.txt"); //file output stream with destination which is the new file
        
        //read each byte of information from the source file
        int i = 0;    //i holds the integer form  of the byte information
        while((i = in.read()) != -1){
            out.write(i);   
            
        }
    }
}
