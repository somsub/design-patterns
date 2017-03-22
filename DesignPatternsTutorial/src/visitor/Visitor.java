package visitor;

public interface Visitor {
	//use method overloading to call the method on the correct instance
	public double visit(Liquor visitable);
	public double visit(Tobacco visitable);
	public double visit(Groceries visitable);
	
}
