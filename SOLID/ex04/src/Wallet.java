public class Wallet implements PaymentProvider {
    @Override
    public String payment(double amount) {
        return "Wallet debit: " + amount;
    }
    
}
