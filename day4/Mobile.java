package week1.day4;

public class Mobile {


			
	private void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("send Message");
	}
		
	private void audioCall()   {
		System.out.println("Audio Call");
	}
	
	private void videoCall() {
		System.out.println("Video Call");
	}
	
	private void shareDocument()  {
		System.out.println("Share Document");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();
		mob.audioCall();
		mob.videoCall();
		mob.sendMessage();
		mob.shareDocument();

	}

}
