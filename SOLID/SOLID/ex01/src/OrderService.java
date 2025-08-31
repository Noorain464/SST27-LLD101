public class OrderService {
    TaxCalculator taxCalculator;
    Notification notification;
    public OrderService(TaxCalculator taxCalculator, Notification notification) {
        this.taxCalculator = taxCalculator;
        this.notification = notification;
    }

    void checkout(String customerEmail, double subtotal) {
        //SRP Violation: OrderService is doing 3 things here
        //1. Calculating tax
        //2. Sending email
        //3. Storing order (pretend DB)
        double total = taxCalculator.totalWithTax(subtotal);
        notification.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
        
    }
}