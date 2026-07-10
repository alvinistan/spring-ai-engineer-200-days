package code;

import java.util.Scanner;

public class SqureCalculator {

    public static int findSqure(int number){
        return number * number;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int squre = findSqure(number);

        System.out.println("Squre : " +squre);

        scanner.close();
    }
}
