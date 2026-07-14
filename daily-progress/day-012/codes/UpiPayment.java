package codes;

public class UpiPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
