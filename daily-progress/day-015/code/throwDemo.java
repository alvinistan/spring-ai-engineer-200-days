package code;

public class throwDemo {

    public static void validateAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
        System.out.println("Eligible...");
    }

    static void main(String[] args) {
        validateAge(16);

    }
}
