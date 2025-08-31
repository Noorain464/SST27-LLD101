public class UPI implements PaymentProvider {
    @Override
    public String payment(double amount) {
        return "Paid via UPI: " + amount;
    }
    
}
