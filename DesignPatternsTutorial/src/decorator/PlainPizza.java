package decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getName() {
		return "Plain Pizza";
	}

	@Override
	public String getToppings() {
		return "Regular Plain Cheese";
	}

}
