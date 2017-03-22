package visitor;

import java.text.DecimalFormat;

public class HolidayTaxVisitor implements Visitor {
    private static DecimalFormat df = new DecimalFormat("#.##");
	@Override
	public double visit(Liquor visitable) {
		// TODO Auto-generated method stub
		return Double.parseDouble(df.format(visitable.getPrice() *.05)) ;
	}

	@Override
	public double visit(Tobacco visitable) {
		return Double.parseDouble(df.format(visitable.getPrice() *.07)) ;
	}

	@Override
	public double visit(Groceries visitable) {
		return Double.parseDouble(df.format(visitable.getPrice() * 0 )) ;
	}

}
