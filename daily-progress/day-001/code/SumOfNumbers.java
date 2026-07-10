import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive limit: ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("The limit must be positive.");
        } else {

            int sum = 0;

            for (int number = 1; number <= limit; number++) {
                sum = sum + number;
            }

            System.out.println("Sum from 1 to " + limit + " = " + sum);
        }

        scanner.close();
        }
    }
