package code;

public class BankAccountDemo {
    static void main(String[] args) {
        BankAccountd015 bank = new BankAccountd015("007579045", "Vinistan A L", 34500);
        bank.displayAccountDetails();

        try{
            bank.withdraw(56000.5);
        }catch (InsufficientBalanceException e){
            System.out.println("Transcation Faild: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Invalid transcation: " + e.getMessage());
        }

    }
}
