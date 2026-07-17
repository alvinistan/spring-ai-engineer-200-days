package code;

public class BankAccountd015 {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    BankAccountd015(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0) {
            System.out.println("Deposit amount must be greater than zero");
            return;
        }
        balance += amount;
        System.out.println("Deposit succesfully : "+ amount);
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(Double amount) throws InsufficientBalanceException{
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }

        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance. Available balance: RS" + balance);
        }
        balance -= amount;
        System.out.println("withdrawal Successful: RS."+ amount);
        System.out.println("Remaining Balance: Rs." + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
    }

}
