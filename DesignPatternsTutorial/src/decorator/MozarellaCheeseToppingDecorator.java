package decorator;

public class MozarellaCheeseToppingDecorator implements Pizza {

	private Pizza pizza; 
	
	public MozarellaCheeseToppingDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName() + " decorated with Mozarella cheese";
	}

	@Override
	public String getToppings() {
		return pizza.getToppings() + " Onions and Green Peppers ";
	}

}
