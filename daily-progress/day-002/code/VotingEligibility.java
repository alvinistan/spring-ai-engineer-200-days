import java.util.Scanner;

public class VotingEligibility {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Eligible to Vote...");
        } else {
            System.out.println("Not Eligible....");
        }
    }
}
