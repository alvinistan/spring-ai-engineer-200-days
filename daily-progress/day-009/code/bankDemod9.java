package code;

public class bankDemod9 {
    static void main(String[] args) {
        BankAccountd9 ba = new BankAccountd9();


        ba.setHolder("Kani Leenas");
        ba.deposit(233200);

        ba.withDraw(231200);

        System.out.println(ba.getBalance());
    }
}
