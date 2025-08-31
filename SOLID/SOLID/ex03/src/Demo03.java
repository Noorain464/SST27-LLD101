public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        ShipmentType standardType = new StandardShipping();

        Shipment standard = new Shipment(standardType, 2.0);
        System.out.println(calculator.cost(standard));

        ShipmentType expressType = new ExpressShipping();
        Shipment express = new Shipment(expressType, 2.0);
        System.out.println(calculator.cost(express));

    }
}
