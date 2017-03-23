package decorator;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza somePizza;
	
	public ToppingDecorator(Pizza pizza) {
		somePizza = pizza;
	}
	
	
	@Override
	public String getDescription() {
		return somePizza.getDescription();
	}

	@Override
	public double getPrice() {
		return somePizza.getPrice();
	}

}
