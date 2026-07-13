package code;

public class BankDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Alkanistan", 342500);

        account.display();

//        Execution order -> Memory allocated -> Constructor called -> Object initialized -> Reference returned

    }
}
