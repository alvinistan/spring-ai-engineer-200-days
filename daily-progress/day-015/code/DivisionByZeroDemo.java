package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZeroDemo {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first Number : ");
            int num1 = sc.nextInt();

            System.out.println("Enter the Second Number : ");
            int num2 = sc.nextInt();

            int result = num1 /num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: A number cannot be divided by zero");
        } catch (InputMismatchException e){
            System.out.println("Error: Please enter a valid integer number");
        } finally {
            sc.close();
            System.out.println("Program completed");
        }
    }
}
