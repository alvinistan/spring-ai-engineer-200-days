import java.util.Scanner;

public class EvenOddNumberIdentifier {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number =  scanner.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is Even");
        }else {
            System.out.println(number + " is Odd");
        }
        scanner.close();
    }
}
