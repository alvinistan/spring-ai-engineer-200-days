public class LogicalOperators {

    static void main(String[] args) {

        int age = 25;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);
        System.out.println(age >= 18 || hasLicense);
        System.out.println(!hasLicense);
    }
}
