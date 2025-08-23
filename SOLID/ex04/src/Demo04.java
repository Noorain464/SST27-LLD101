
public class Demo04 {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        PaymentProvider card = new Card();
        PaymentProvider upi = new UPI();
        PaymentProvider wallet = new Wallet();
        System.out.println(ps.pay(new Payment(card, 999)));
        System.out.println(ps.pay(new Payment(wallet, 199)));
    }
}
