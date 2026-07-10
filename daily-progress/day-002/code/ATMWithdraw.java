public class ATMWithdraw {
    static void main(String[] args) {
        double balance = 5000;
        double amount = 1000;

        if(balance >= amount && amount > 0){
            System.out.println("Withdrawal Successful...");
        }else{
            System.out.println("Transaction Failed...");
        }
    }
}
