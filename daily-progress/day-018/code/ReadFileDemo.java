package code;

import java.io.File;
import java.util.Scanner;

public class ReadFileDemo {
    static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
