package bridge;

public class TVRemotePause extends RemoteControl {
	private boolean isTvPaused;

	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void button9Pressed() {
		isTvPaused = !isTvPaused;
		if(isTvPaused){
			System.out.println("TV is Paused");
		}else{
			System.out.println("TV is Not Paused");
		}
		
	}

}
