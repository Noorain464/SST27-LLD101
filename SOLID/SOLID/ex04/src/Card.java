public class Card implements PaymentProvider {
    @Override
    public String payment(double amount) {
        return "Charged card: " + amount;
    }
    
}
