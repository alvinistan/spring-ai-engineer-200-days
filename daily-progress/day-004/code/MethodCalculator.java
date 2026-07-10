package code;

import java.util.Scanner;

public class MethodCalculator {

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static double modulus(double number1, double number2) {
        return number1 % number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n========== Calculator ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            choice = input.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                double number1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double number2 = input.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println(
                                "Answer = " + add(number1, number2));
                        break;

                    case 2:
                        System.out.println(
                                "Answer = " + subtract(number1, number2));
                        break;

                    case 3:
                        System.out.println(
                                "Answer = " + multiply(number1, number2));
                        break;

                    case 4:
                        if (number2 == 0) {
                            System.out.println(
                                    "Error: Cannot divide by zero.");
                        } else {
                            System.out.println(
                                    "Answer = " + divide(number1, number2));
                        }
                        break;

                    case 5:
                        if (number2 == 0) {
                            System.out.println(
                                    "Error: Cannot find modulus by zero.");
                        } else {
                            System.out.println(
                                    "Answer = " + modulus(number1, number2));
                        }
                        break;

                    default:
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Calculator closed.");
            } else {
                System.out.println("Invalid option. Select 1 to 6.");
            }

        } while (choice != 6);

        input.close();
    }
}