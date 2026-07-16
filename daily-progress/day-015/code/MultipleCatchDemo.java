package code;

public class MultipleCatchDemo {
    static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Error...");
        } catch (NullPointerException e){
            System.out.println("Null value...");
        }
    }
}
