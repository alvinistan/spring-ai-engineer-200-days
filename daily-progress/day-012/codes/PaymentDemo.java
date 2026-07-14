package codes;

public class PaymentDemo {
    static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay(45000);

        payment = new UpiPayment();
        payment.pay(3000);
    }
}
