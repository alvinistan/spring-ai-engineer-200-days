package code;

import java.util.Scanner;

public class EvenOddChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        input.close();
    }
}