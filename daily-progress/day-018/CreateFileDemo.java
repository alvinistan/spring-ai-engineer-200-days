import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    static void main(String[] args) {
        File file = new File("students.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File created Successfully..");
            } else{
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
