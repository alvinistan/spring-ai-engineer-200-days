package code;

public class ArrayIndexExceptionDemo {
    static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};

        try {
            System.out.println("Value : " + array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The array index is outside the valid range.");
            System.out.println("Valid indexes are 0 to " + (array.length - 1));
        }
        System.out.println("Program completed...");
    }
}
