package decorator;

public class BuffaloSauce extends ToppingDecorator {

	public BuffaloSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Buffalo Sauce");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Buffalo Sauce";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 0.36 ;
	}
	
	

}
