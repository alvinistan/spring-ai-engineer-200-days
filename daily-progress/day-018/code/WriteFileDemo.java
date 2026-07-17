package code;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
    static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("students.txt");
            writer.write("Welcome to Java File Handling....");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
