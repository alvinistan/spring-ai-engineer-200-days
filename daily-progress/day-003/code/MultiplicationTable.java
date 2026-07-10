package code;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int number = scanner.nextInt();

        System.out.println("Multiplication table of "+ number);

        for(int multiplier=1; multiplier <=12; multiplier++){
            int result = number * multiplier;

            System.out.println(number + " * " + multiplier + " = " + result);
        }

    }
}
