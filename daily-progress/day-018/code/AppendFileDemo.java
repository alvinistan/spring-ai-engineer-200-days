package code;

import java.io.FileWriter;

public class AppendFileDemo {
    static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("students.txt",true);
            writer.write("\nSpring Boot");
            System.out.println("File Writing Successfully...");
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
