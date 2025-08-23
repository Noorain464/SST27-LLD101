public class ExpressShipping implements ShipmentType {
    @Override
    public double calculateShippingCost(double weight) {
        return 80 + 8 * weight;
    }
    
}
