package bridge;
//    [7]
//[5] [9] [6]
//    [8]
public class TVRemoteMute extends RemoteControl {

	private boolean onMute = false;
	//The coupling is using abstractions
	public TVRemoteMute(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void button9Pressed() {
		onMute = !onMute;
		if(onMute){
			System.out.println("TV Muted");
		}else{
			System.out.println("TV Unmuted");
		}
	}

}
