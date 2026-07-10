import java.util.Scanner;

public class LargestNumberIdentifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First number");
        int number1 = scanner.nextInt();

        System.out.println("Enter Your Second number");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println(number1 + " is Graterthan " + number2);
        } else {
            System.out.println(number2 + " is Graterthan " + number1);
        }
        scanner.close();
    }
}
