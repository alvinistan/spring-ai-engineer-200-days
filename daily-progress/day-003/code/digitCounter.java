package code;

import java.util.Scanner;
public class digitCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        long workingNumber = Math.abs((long) number);
        int digitCount = 0;

        if (workingNumber == 0) {
            digitCount = 1;
        } else {

            while (workingNumber > 0) {
                workingNumber = workingNumber / 10;
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
