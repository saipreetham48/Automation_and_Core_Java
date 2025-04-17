package inheritance;

public class Child extends Parent {
	int c=20;
	int p=30;
	public Child(String names) {
		//super();
		
		//System.out.println("Name is:"+name);
		System.out.println("In child constructor");
	}
	public void abc() {
		System.out.println("In child");
		
		System.out.println(super.p);
		
	}
	public void m1() {
		System.out.println("Method1 in child");
		p1();
	}
	public void m2() {
		System.out.println("Method2 in child");
		m1();
	}
	@Override
	public void poly(int a,int c) {
		System.out.println("In child poly");
	}
	

}
