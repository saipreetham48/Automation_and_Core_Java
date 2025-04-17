package interfaces;

public class MainClass implements I1,I2{

	@Override
	public void abc() {
		System.out.println("In main");
	}
	public static void main(String[] args) {
		MainClass m=new MainClass();
		m.abc();
	}

}
