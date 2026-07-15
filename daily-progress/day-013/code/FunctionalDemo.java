package code;

public class FunctionalDemo {
    static void main(String[] args) {

        Functional_Interface functionalInterface =  new Functional_Interface() {
            @Override
            public void hello() {
                System.out.println("Hello Java");
            }
        };

        functionalInterface.hello();
    }
}
