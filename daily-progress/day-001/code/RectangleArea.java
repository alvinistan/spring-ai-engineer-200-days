import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);

        scanner.close();
    }
}