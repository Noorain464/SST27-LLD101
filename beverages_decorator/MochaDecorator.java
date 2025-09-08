package beverages_decorator;

public class MochaDecorator extends BaseDecorator {

    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 200;
    }
    
}
