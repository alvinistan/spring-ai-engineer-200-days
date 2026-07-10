package code;

public class StudentResult {

    public static boolean marks(int Marks){
        return Marks >= 35;
    }

    static void main(String[] args) {
        System.out.println(marks(30));
    }
}
