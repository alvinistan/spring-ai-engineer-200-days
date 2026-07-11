package codes;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        int[] numbers = {23, 45, 564, 324, 756, 432, 453};

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input your target value: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (target == numbers[i]) {
                System.out.println("Yeah! We found the target value " + target +
                        " at index " + i);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("We couldn't find the target value in the list.");
        }

        sc.close();
    }
}