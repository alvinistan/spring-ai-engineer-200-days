public class LogicalNotDemo {

    public static void main(String[] args) {

        boolean isLoggedIn = false;

        System.out.println(!isLoggedIn);


        int age = 20;
        boolean hasLicense = true;

        System.out.println("AND : " + (age >= 18 && hasLicense));

        System.out.println("OR  : " + (age >= 18 || hasLicense));

        System.out.println("NOT : " + (!hasLicense));

    }
}
