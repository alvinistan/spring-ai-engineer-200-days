import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator....");

        System.out.println("Enter Your first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter Your Second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println();
        System.out.println("Results");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        scanner.close();

    }
}
