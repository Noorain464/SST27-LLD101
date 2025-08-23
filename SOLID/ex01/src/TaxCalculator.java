public class TaxCalculator {
    double taxRate = 0.18;
    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }
    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
    
} 
