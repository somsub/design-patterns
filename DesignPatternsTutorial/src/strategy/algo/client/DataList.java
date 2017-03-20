package strategy.algo.client;

import strategy.algo.Sortable;

public class DataList {
	private Sortable sorter;
	

	public DataList(Sortable sorter) {
		super();
		this.sorter = sorter;
	}

	public void setSorter(Sortable sorter) {
		this.sorter = sorter;
	}
	
	public void organize(){
		this.sorter.sort();
	}

}
