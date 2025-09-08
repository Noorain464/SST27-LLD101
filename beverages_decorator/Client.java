package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
		coffee = new ChocolateDecorator(coffee);
		System.out.println("Coffee with chocolate");
		System.out.println(coffee.cost());
		coffee = new SoyMilkDecorator(coffee);
		System.out.println("Coffee with chocolate and soymilk");
		System.out.println(coffee.cost());
		coffee = new MochaDecorator(coffee);
		System.out.println("Coffee with chocolate and soymilk and mocha");
		System.out.println(coffee.cost());
		

	}

}