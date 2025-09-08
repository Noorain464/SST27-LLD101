package beverages_decorator;

public class SoyMilkDecorator extends BaseDecorator {

    public SoyMilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 150;
    }
    
}
