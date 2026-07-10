package code;

import java.util.Scanner;

public class CubeCalculator {

    public static int findCube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int cube = findCube(number);

        System.out.println("Cube = " + cube);

        input.close();
    }
}