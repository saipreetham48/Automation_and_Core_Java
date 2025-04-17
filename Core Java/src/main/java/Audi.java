
public class Audi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceDemo fd=new FunctionalInterfaceDemo() {
			
			@Override
			public void drive() {
				System.out.println("Drive method is called");
				
			}
		};
		fd.drive();

	}

}
