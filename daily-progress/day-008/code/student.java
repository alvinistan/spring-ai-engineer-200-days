package code;
public class student {

    int studentId;
    String studentName;

    student(){
        System.out.println("Student object created...");
    }

    student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public student(int i, String alkanistan, int i1) {
    }

    void display(){

        System.out.println("Student ID: " +studentId);
        System.out.println("Student Name: "+studentName);
    }

    static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(101,"Alkanistan");

        s2.display();
        s1.display();
    }
}
