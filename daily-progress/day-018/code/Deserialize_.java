package code;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize_ {
    static void main(String[] args) {
        try (
                FileInputStream file =
                        new FileInputStream("student.ser");

                ObjectInputStream input =
                        new ObjectInputStream(file)
        ) {
            studentSe se = (studentSe) input.readObject();

            se.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
