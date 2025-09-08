package beverages_decorator;

public class ChocolateDecorator extends BaseDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 100;
    }
    
}
