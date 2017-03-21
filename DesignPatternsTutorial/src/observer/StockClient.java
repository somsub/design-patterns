package observer;

public class StockClient {

	public static void main(String[] args) {
		// Static Scenario
		
		// Create a StockPublisher
		StockPublisher publisher = new StockPublisher();
		
		
		// Create 2 observers with the Stock Publisher reference
		StockPriceObserver observer1 = new StockPriceObserver(publisher);
		StockPriceObserver observer2 = new StockPriceObserver(publisher);
		
		
		// stockPublisher.setPrice(new Price(...))
		//publisher.setPrice(new Price(610.45,466.4,444.56));
		
		// expect the observers to print the new stock prices in time
		
		//publisher.unRegister(observer2);
		//publisher.setPrice(new Price(610.45,466.4,500.44));
		
		
		
		// Thread based scenario 
		StockFetcher stockFetcher = new StockFetcher(publisher);
		new Thread(stockFetcher).start();
		// create a stock grabbing API that every 2 secs and broadcasts
		
		

	}

}
class StockFetcher implements Runnable{
	private StockPublisher stockPublisher;
	
	public StockFetcher(StockPublisher stockPublisher){
		this.stockPublisher = stockPublisher;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			double delta = Math.round(Math.random() * 20 - 10);
			this.stockPublisher.setPrice(new Price(100.0 + delta ,200.0 + delta,300.0 + delta));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
	}
	
}
