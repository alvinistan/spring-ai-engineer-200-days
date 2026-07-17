package code;

public class PasswordValidatorDemo {
    static void main(String[] args) {
        try {
            PasswordValidator.validatePassword("dwkwejf");
        } catch (InvalidPasswordException e) {
            System.out.println("Password error: "+ e.getMessage());
        }
    }
}
