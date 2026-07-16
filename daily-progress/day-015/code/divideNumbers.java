package code;

public class divideNumbers {
    static void main(String[] args) {

        try {
            int result = 10/0;
            System.out.println("result");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero...");
        }
        System.out.println("program Continue....");
    }
}
