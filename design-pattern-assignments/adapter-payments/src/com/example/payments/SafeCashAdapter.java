package com.example.payments;

public class SafeCashAdapter implements PaymentGateway {
    private final SafeCashClient client;
    public SafeCashAdapter(SafeCashClient client) {
        this.client = client;
    }
    @Override
    public String charge(String customerId, int amountCents) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'charge'");
        return client.createPayment(amountCents, customerId).confirm();
    }
    
}
