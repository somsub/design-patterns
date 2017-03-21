package observer;

public class StockPriceObserver implements Observable {

	private Price stockPrices = new Price(0d, 0d, 0d);
	
	private int observerId;
	
	public static int observerTracker = 0;
	
	public StockPriceObserver(Subject subject){
		this.setObserverId(++observerTracker);
		System.out.println("Creating Observer " + this.observerId);
		subject.register(this);
	}
	
	@Override
	public void update(Price newStockPrices) {
		 this.stockPrices = newStockPrices;
		 printPrices();
	}
	private void printPrices() {
		System.out.println(this.observerId +  " observer:  The price is " + this.stockPrices );
	}

		public void setObserverId(int observerId) {
		this.observerId = observerId;
	}
	

}
