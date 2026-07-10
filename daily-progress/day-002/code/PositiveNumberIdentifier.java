import java.util.Scanner;

public class PositiveNumberIdentifier {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");

        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Positive Number");
        }

        scanner.close();
    }
}
