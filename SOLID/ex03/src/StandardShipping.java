public class StandardShipping implements ShipmentType {
    @Override
    public double calculateShippingCost(double weight) {
        return 50 + 5 * weight;
    }
    
}
