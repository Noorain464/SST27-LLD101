public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(0.18);
        Notification notification = new EmailClient();
        OrderService oService = new OrderService(taxCalculator, notification);
        oService.checkout("a@shop.com", 100.0);
    }
}
