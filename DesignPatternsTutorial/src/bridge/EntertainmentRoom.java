package bridge;

public class EntertainmentRoom {
	
	public static void main(String[] args) {
		
		System.out.println("Creating a Remote with Pause for a TV");
		TVRemotePause tvRemoteWithPause = new TVRemotePause(new TVDevice());
		tvRemoteWithPause.button5Pressed();
		tvRemoteWithPause.button6Pressed();
		tvRemoteWithPause.button7Pressed();
		tvRemoteWithPause.button7Pressed();
		tvRemoteWithPause.button7Pressed();
		tvRemoteWithPause.button8Pressed();
		tvRemoteWithPause.button9Pressed();
		tvRemoteWithPause.button9Pressed();
		tvRemoteWithPause.button9Pressed();
		tvRemoteWithPause.button9Pressed();
		
		
		System.out.println("Create a TV Remote with a Pause");
		TVRemoteMute tvRemoteMute = new TVRemoteMute(new TVDevice());
		tvRemoteMute.button5Pressed();
		tvRemoteMute.button6Pressed();
		tvRemoteMute.button7Pressed();
		tvRemoteMute.button7Pressed();
		tvRemoteMute.button7Pressed();
		tvRemoteMute.button8Pressed();
		tvRemoteMute.button9Pressed();
		tvRemoteMute.button9Pressed();
		tvRemoteMute.button9Pressed();
		tvRemoteMute.button9Pressed();
	}

}
