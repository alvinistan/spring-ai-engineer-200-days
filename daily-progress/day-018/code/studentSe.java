package code;
import java.io.*;

public class studentSe implements Serializable {
    private int id;
    private String name;

    public studentSe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("ID : "+ id);
        System.out.println("Name :" + name);
    }

    static void main(String[] args) {
        studentSe se = new studentSe(001,"kani Leenas");
        try (
            FileOutputStream file = new FileOutputStream("student.ser");

            ObjectOutputStream output = new ObjectOutputStream(file)
        ) {
            output.writeObject(se);
            System.out.println("Object serialized successfully..");
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
