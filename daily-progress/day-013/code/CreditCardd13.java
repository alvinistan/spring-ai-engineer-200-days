package code;

public class CreditCardd13 implements Paymentd13{
    @Override
    public void pay(double amount) {
        System.out.println("\"Paid ₹\" + amount + \" using Credit Card\"");
    }
}
