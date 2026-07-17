package code;

public class NullPointerExceptionDemo {
    static void main(String[] args) {
        try {
            String message = null;
            System.out.println("Message Length : "+ message.length());
        } catch (NullPointerException e){
            System.out.println("Error: The message is null");
        }
        System.out.println("program continue normally");
    }
}
