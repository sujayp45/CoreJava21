package Multiple_Inheritance;

public class SmartSpeaker implements MediaPlayable,SmartDevice {
      
	void voiceAssistant() {
		System.out.println("Listning for commands....");
	}

	@Override
	public void connectToWiFi() {
		// TODO Auto-generated method stub
		System.out.println("connecting wifi");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("playing music");
	}
}
