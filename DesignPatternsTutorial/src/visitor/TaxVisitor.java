package visitor;
import java.text.DecimalFormat;
public class TaxVisitor implements Visitor {
	private static DecimalFormat df = new DecimalFormat("#.##");

	@Override
	public double visit(Liquor visitable) {
		return Double.parseDouble(df.format(visitable.getPrice() * 0.60));
	}

	@Override
	public double visit(Tobacco visitable) {
		return Double.parseDouble(df.format(visitable.getPrice() * .40));
	}

	@Override
	public double visit(Groceries visitable) {
		return Double.parseDouble(df.format(visitable.getPrice() * 0));
	}
}
