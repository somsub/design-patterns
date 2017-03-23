package decorator;

public class GarlicCheese extends ToppingDecorator {

	public GarlicCheese(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Garlic Cheese");
	}

	@Override
	public String getDescription() {
		return somePizza.getDescription() + ", Garlic Cheese";
	}

	@Override
	public double getPrice() {
		return somePizza.getPrice() + 0.56;
	}

}
