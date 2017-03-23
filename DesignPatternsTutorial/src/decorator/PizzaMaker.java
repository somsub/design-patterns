package decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza pizza = new PlainPizza();
		System.out.println("Pizza is " + pizza.getName() + " with toppings " + pizza.getToppings());
        Pizza mozzarelaCheesePizza = new MozarellaCheeseToppingDecorator(new PlainPizza());
        System.out.println("Pizza is " + mozzarelaCheesePizza.getName() + " with toppings " + mozzarelaCheesePizza.getToppings());
	}

}
