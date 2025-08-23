public class OvernightShipping implements ShipmentType {
    @Override
    public double calculateShippingCost(double weight) {
        return 100 + 10 * weight;
    }
    
}
