package innerclasses;

public class OuterClass {
	//local class and ananymous class
	private int id=98;

	public static void main(String[] args) {
		 int ids=87;
		abstract class A{
			public void print() {
				System.out.println("ids is:"+ids);
			}
			public abstract void display();
			
			
		}
		class B extends A{

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Display method is called");
				
			}
						
		}
		B b=new B();
		b.display();

		
		

	}
	public void pr() {
		System.out.println("Print method is called");
	}
	

}
