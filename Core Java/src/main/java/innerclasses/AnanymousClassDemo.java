package innerclasses;

public class AnanymousClassDemo {

	public static void main(String[] args) {
		A a=new A() {
			public void show() {
				System.out.println(" updated Show method is called");
			}
		};
		a.show();
		AbstractClass ab=new AbstractClass() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("Abstract method is called");
				
			}
		};
		ab.add();
		ab.sub();
		Interface1 i=new Interface1() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("Add method from interface is called");
				
			}
		};
		i.add();
		

	}

}
class A
{
	public void show() {
		System.out.println("Show method is called");
	}
	public void display() {
		System.out.println("display method is called");
	}
}

