package code;

import java.util.Scanner;

public class LargestNumber {

    public static int findLargest(int number1, int number2, int number3) {
        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        int largest = findLargest(number1, number2, number3);

        System.out.println("Largest number = " + largest);

        input.close();
    }
}