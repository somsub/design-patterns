package bridge;

public class TVDevice extends EntertainmentDevice {

	@Override
	public void button5Pressed() {
		System.out.println("TV Channel Down");
	}

	@Override
	public void button6Pressed() {
		System.out.println("TV Channel Up");
	}	
}
