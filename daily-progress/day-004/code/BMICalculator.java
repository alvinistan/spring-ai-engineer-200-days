package code;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String findBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Weight and height must be greater than zero.");
        } else {
            double bmi = calculateBMI(weight, height);
            String category = findBMICategory(bmi);

            System.out.printf("BMI = %.2f%n", bmi);
            System.out.println("Category = " + category);
        }

        input.close();
    }
}