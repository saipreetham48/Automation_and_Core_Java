package interfaces;

public class InterfaceDemo implements Interface2, Interface1 {

	@Override
	public int add() {
		// TODO Auto-generated method stub
		System.out.println("In add method");
		return 0;
	}

	@Override
	public int p1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int p2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int p3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int p4() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}
	
  public static void main(String[] args) {
	InterfaceDemo id=new InterfaceDemo();
	id.add();
}

}
