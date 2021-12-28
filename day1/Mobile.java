package week1.day1;

public class Mobile {
	
	String mobileModel = "SamsungM30S";
	int mobileWeight = 500;
	boolean isFullyCharged = false;
	double mobileCost = 13500.3434;
	
	
			
	
	private void makeCall() {
		System.out.println("Please call lokesh");

	}
	private void sendMessage() {
		System.out.println("Send message to lokesh");

	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMessage();
		System.out.println("Is mobile fully chared = " + myMobile.isFullyCharged);
		System.out.println("My mobile cost is " + myMobile.mobileCost);
		System.out.println("My mobile model is " + myMobile.mobileModel);
		System.out.println("My mobile weight is" + myMobile.mobileWeight);
		
		
		
	}

}


