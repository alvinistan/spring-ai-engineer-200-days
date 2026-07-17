package code;

public class PasswordValidator {
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password == null || password.isBlank()) {
            throw new InvalidPasswordException("Password cannot be empty..");
        }

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must contains at least8 characters..");
        }

        if (!password.contains(".*[A-Z}.*")) {
            System.out.println("Password must contain at least one uppercase letter.");
        }
        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException(
                    "Password must contain at least one number."
            );
        }
        System.out.println("Password is Valid...");

    }
}
