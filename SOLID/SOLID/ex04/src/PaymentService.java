
public class PaymentService {
    String pay(Payment p){
        return p.provider.payment(p.amount);
    }
}