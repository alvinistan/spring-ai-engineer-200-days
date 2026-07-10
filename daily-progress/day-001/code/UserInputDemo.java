import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your Expected Salary: ");
        double salary = scanner.nextDouble();

        System.out.println();
        System.out.println("User Details");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();

    }
}
