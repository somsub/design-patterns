package visitor;

public class TaxClient {

	public static void main(String[] args) {
		System.out.println("Regular Tax Calculator");
		
		Visitor taxVisitor = new TaxVisitor();
		Liquor liquor = new Liquor(300.0);
		System.out.println("Liqour tax is " + liquor.accept(taxVisitor));
		
		Tobacco tobacco = new Tobacco(400.0);
		System.out.println("Tobacco tax is " + tobacco.accept(taxVisitor));
		
		Groceries groceries = new Groceries(500.0);
		System.out.println("Groceries tax is " + groceries.accept(taxVisitor));
		
		System.out.println("Holiday Tax Calculator");
		Visitor holidayTaxVisitor = new HolidayTaxVisitor();
		Liquor holidayLiqour = new Liquor(300.0);
		System.out.println("Liqour tax is " + holidayLiqour.accept(holidayTaxVisitor));
		
		Tobacco holidayTobacco = new Tobacco(400.0);
		System.out.println("Tobacco tax is " + holidayTobacco.accept(holidayTaxVisitor));
		
		Groceries holidayGroceries = new Groceries(500.0);
		System.out.println("Groceries tax is " + holidayGroceries.accept(holidayTaxVisitor));
		
		
	}

}
