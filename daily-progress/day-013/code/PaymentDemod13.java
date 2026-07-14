package code;

public class PaymentDemod13 {
    static void main(String[] args) {
        Paymentd13 paymentd13;
        paymentd13 = new CreditCardd13();
        paymentd13.pay(7000);

        paymentd13 = new UpiPayment();
        paymentd13.pay(7600);

    }
}
