package abstractPractice;

public abstract class Lenovo implements Laptop {
	public void copy() {
		System.out.println("Lenovo copy code");
	}
	public void paste() {
		System.out.println("Lenovo paste code");
	}
	public abstract void cut();
	public abstract void keyBoard();

}
