package bridge;
//     [7]
// [5] [9] [6]
//     [8]
public abstract class EntertainmentDevice {
	private int volumeLevel = 0;
	
	// I have partially implemented this class
	public abstract void button5Pressed();
	public abstract void button6Pressed();
	
	public void button7Pressed() {
		System.out.println("At volume level " + ++volumeLevel);
	}
	public void button8Pressed(){
		System.out.println("At volume level " + --volumeLevel);
	}

}
