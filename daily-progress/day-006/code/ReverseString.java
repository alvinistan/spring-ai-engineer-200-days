package code;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Reverse String : ");
        String reverse = sc.nextLine();

        for (int i = reverse.length()-1; i >=0; i--) {
            System.out.println(reverse.charAt(i));
        }
    }
}
