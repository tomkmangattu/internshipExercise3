package internshipTask3;

public class GoogleChrome extends Browser{
	
	private boolean isLocationAccessible;
	private boolean isCameraAccessible;
	private boolean isMicrophoneAccessible;
	private final String versionNumber = "1.1";

	GoogleChrome() {
		super("GoogleChrome");
		isLocationAccessible = false;
		isCameraAccessible = false;
		isMicrophoneAccessible = false;
		
	}
	
	@Override
	void whoAmI() {
		System.out.println("I am Google Chrome");
	}
	
	void setPermission(boolean isLocationAccessible) {
		this.isLocationAccessible = isLocationAccessible;
	}
	
	void setPermission(boolean isLocationAccessible, boolean isCameraAccessible) {
		this.isLocationAccessible = isLocationAccessible;
		this.isCameraAccessible = isCameraAccessible;
	}
	
	void setPermission(boolean isLocationAccessible, boolean isCameraAccessible, boolean isMicrophoneAccessible) {
		this.isLocationAccessible = isLocationAccessible;
		this.isCameraAccessible = isCameraAccessible;
		this.isMicrophoneAccessible = isMicrophoneAccessible;
	}
	
	boolean[] getPermissions() {
		return new boolean[] {isLocationAccessible, isCameraAccessible, isMicrophoneAccessible};
	}
	
	void showPermissions() {
		System.out.println("Location Accessible :" + isLocationAccessible);
		System.out.println("Camera Accessible :" + isCameraAccessible);
		System.out.println("Microphone Accessible :" + isMicrophoneAccessible);
	}
	
	

}
