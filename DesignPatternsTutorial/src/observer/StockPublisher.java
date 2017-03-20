package observer;

import java.util.ArrayList;
import java.util.List;

public class StockPublisher implements Subject {
	//Imagine this data is pulled calling a react-time API 
	private Price stockPrices = new Price(160d,167.67d,200.7d);

	private List<Observable> observers = new ArrayList<Observable>();
	
	@Override
	public void register(Observable newObserver) {
		this.observers.add(newObserver);
	}

	@Override
	public void unRegister(Observable observer) {
		int observerIndex = this.observers.indexOf(observer);
		System.out.println("Deleting observer " + observerIndex);
		this.observers.remove(observerIndex);
	}

	@Override
	public void broadcast() {
		for(Observable observer : this.observers){
			observer.update(this.stockPrices);
		}
	}
	// Client calls setPrice on the Subject that broadcasts the new price to all the observers
	public void setPrice(Price newStockPrices){
		this.stockPrices = newStockPrices;
		this.broadcast();
	}

}
