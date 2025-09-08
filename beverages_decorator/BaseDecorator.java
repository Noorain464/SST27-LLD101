package beverages_decorator;

public class BaseDecorator extends Beverage {
    protected Beverage beverage;

    public BaseDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
    
}
