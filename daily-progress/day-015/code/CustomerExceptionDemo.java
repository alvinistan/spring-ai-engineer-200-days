package code;

public class CustomerExceptionDemo {
    static void main(String[] args) {
        try {
            Agevalidator.validate(23);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
