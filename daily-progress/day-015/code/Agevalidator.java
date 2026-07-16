package code;

public class Agevalidator {
    public static void validate(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible....");
    }

}
