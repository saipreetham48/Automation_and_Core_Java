package interfacePractice;

public class Redmi implements Mobile {

	
	public void camera() {
		
		System.out.println("Redmi camera feature");
	}

	
	public void battery() {
		System.out.println("Redmi battery feature");
		
	}

	
	public void ram() {
		System.out.println("Redmi ram feature");
		
	}

	
	public void rom() {
		System.out.println("Redmi rom feature");
		
	}
	//we can add extra implementations in class implementers
	public void lock() {
		System.out.println("Redmi lock feature");
	}

}
