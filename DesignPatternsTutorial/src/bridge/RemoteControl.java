package bridge;
//    [7]
//[5] [9] [6]
//    [8]
public abstract class RemoteControl {
	
	private EntertainmentDevice device;
	
	public RemoteControl(EntertainmentDevice newDevice){
		device = newDevice;
	}
    
	public void button5Pressed(){
		device.button5Pressed();
	}
	
	public void button6Pressed(){
		device.button6Pressed();
	}
	
	public void button7Pressed(){
		device.button7Pressed();
	}
	
	public void button8Pressed(){
		device.button8Pressed();
	}
	
	public abstract void button9Pressed();
	
	
}
