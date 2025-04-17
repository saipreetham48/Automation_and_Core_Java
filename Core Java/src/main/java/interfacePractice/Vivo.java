package interfacePractice;

public class Vivo implements Mobile {
	public void camera() {

		System.out.println("Vivo camera feature");
	}

	public void battery() {
		System.out.println("Vivo battery feature");

	}

	public void ram() {
		System.out.println("Vivo ram feature");

	}

	public void rom() {
		System.out.println("Vivo rom feature");

	}
	@Override
	public void charging() {
		System.out.println("Vivo charging feature");
	}
}
