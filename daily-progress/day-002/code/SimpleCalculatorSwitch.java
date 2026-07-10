import java.util.Scanner;

public class SimpleCalculatorSwitch {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Choose Option: ");
        int choice = scanner.nextInt();

        System.out.println("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Answer: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Answer: " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("Answer: " + (firstNumber * secondNumber));
                break;
            case 4:
                if(secondNumber == 0){
                    System.out.println("Division by zero is not allowed...");
                } else {
                    System.out.println("Answer: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
        scanner.close();


    }
}
