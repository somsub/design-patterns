package decorator;

import java.text.DecimalFormat;

public class PizzaMaker {
	

	public static void main(String[] args) {
	  Pizza plainPizza = new PlainPizza();
	  displayPizza(plainPizza);
	  
	  Pizza buffaloSauceGarlicPizza = new BuffaloSauce(new GarlicCheese(new PlainPizza()));
	  displayPizza(buffaloSauceGarlicPizza);
	  
	}

	private static void displayPizza(Pizza pizza) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(pizza.getDescription() + " $ " + df.format(pizza.getPrice()));
	}

}
