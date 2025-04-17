package inheritance;

public class SubChild extends Child {
	int p=40;
	public SubChild(String names) {
		super(names);
		System.out.println("In sub child" +names);
		
	}
	public SubChild(int a) {
		super("Sujith");
	}
	
	public void abc() {
		System.out.println("In subchild");
		p1();
		System.out.println(p+super.p);
		
	}
	public void m1() {
		System.out.println("Method1 in subchild");
		p1();
		super.m1();
		
		 
		
	}
	public static void main(String[] args) {
		SubChild sub=new SubChild("Sai");
		
		SubChild sub1=new SubChild(1);
		sub.poly(0, 0);
	
		
	}

}
