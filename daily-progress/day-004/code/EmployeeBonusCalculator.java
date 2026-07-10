package code;

import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static double calculateBonus(double salary) {
        if (salary < 50000) {
            return salary * 0.05;
        } else if (salary <= 100000) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter basic salary: ");
        double salary = input.nextDouble();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            double bonus = calculateBonus(salary);
            double totalSalary = salary + bonus;

            System.out.println("\nEmployee Name = " + employeeName);
            System.out.printf("Basic Salary = Rs. %.2f%n", salary);
            System.out.printf("Bonus = Rs. %.2f%n", bonus);
            System.out.printf("Total Salary = Rs. %.2f%n", totalSalary);
        }

        input.close();
    }
}