package constructer;

public class ConstructorDemo {
	int a=10;
	public ConstructorDemo() {
		System.out.println("In constructor demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo d=new ConstructorDemo();
		System.out.println(d.a);
		NormalConstructor nor=new NormalConstructor();
		nor.abc(null);
		new NormalConstructor().abc("");
		NormalConstructor nor2=new NormalConstructor();
		ParamConstructor par=new ParamConstructor("Sai");
		
		

	}

}

 
