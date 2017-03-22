package visitor;

public class Liquor implements Visitable {
	private double price;

	public Liquor(double price) {
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
