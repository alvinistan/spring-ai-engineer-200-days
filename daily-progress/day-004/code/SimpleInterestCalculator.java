package code;

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(
            double principal,
            double rate,
            double time) {

        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double simpleInterest =
                calculateSimpleInterest(principal, rate, time);

        System.out.printf("Simple Interest = %.2f%n", simpleInterest);

        input.close();
    }
}