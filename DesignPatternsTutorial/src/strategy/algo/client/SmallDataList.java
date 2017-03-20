package strategy.algo.client;

import strategy.algo.BubbleSort;

public class SmallDataList extends DataList {

	public SmallDataList() {
		super(new BubbleSort());
	}

}
