package code;

public class studentsDemo {

    int id;
    String name;
    int marks;

    void display(){


        System.out.println("student id : " + id);
        System.out.println("student name : " + name);
        System.out.println("student marks : " + marks);
    }

    static void main(String[] args) {

        studentsDemo s1 = new studentsDemo();
        s1.name = "leenas";
        s1.id = 102;
        s1.marks = 98;

        System.out.println("student id : " + s1.id);
        System.out.println("student name : " + s1.name);
        System.out.println("student marks : " + s1.marks);

        s1.display();




    }
}
