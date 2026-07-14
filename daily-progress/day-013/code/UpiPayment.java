package code;

public class UpiPayment implements Paymentd13 {
    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );
    }
}
