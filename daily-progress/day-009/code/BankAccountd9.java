package code;

public class BankAccountd9 {

    private String holder;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(int amount){
        if(amount >= 0){
            balance += amount;
        }
    }

    public void withDraw(int amount) {
        if((balance - 2000) >= amount){
            System.out.println("Your Balance : " + balance);
            balance -= amount;
            System.out.println("withdrwaw : " + amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public String getBalance(){
        return ("Mr "+ holder + " " + "Your Balance is " + balance);
    }
}
