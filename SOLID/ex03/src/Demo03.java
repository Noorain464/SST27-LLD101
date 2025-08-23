public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        ShipmentType standardType = new StandardShipping();
        
        Shipment standard = new Shipment(standardType, 2.0);
        System.out.println(calculator.cost(standard));

    }
}
