package singleton;

public class Watch {
	
	private Watch() {}

	public static Watch getWatch() {
		return new Watch();
				
	}
	public void onWatch() {
		System.out.println("We will have an apple watch!");
	}

}
