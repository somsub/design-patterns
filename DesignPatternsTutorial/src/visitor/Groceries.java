package visitor;

public class Groceries implements Visitable {
	private double price;
	public Groceries(double price) {
		super();
		this.price = price;
	}
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
