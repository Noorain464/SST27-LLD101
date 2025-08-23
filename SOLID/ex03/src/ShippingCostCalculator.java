public class ShippingCostCalculator {
    double cost(Shipment s){
        return s.type.calculateShippingCost(s.weightKg);
    }
}
