package decorator;

public class PlainPizza implements Pizza {
	
	public PlainPizza() {
		System.out.println("Adding Dough");
	}

	@Override
	public String getDescription() {
		return "Thin crust plain pizza";
	}

	@Override
	public double getPrice() {
		return 7.0;
	}	

}
