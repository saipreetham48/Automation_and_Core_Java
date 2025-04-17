package staticPackage;

public class StaticKeyword1 {
	//What is static keyword in  Java ?
	//
	

	public static int a = 10;
	static String name = "Sai";
	public int b = 20;

	public static void main(String[] args) {
		System.out.println(a); // 2 //10
		StaticKeyword1 obj = new StaticKeyword1();
		obj.hii(); // 10 20 
		System.out.println(a); //20
		Statickey2.m1(); //20  
		System.out.println(a);//320
	}

//	{
//		System.out.println("Normal block"); // 3
//	}
//
//	static {
//		System.out.println("In static block"); // 1
//	}
//
//	void hello() {
//		System.out.println("in Instance block"); // 4
//	}
	
	void hii() {
		System.out.println(a);
		a = 20;
		System.out.println(a);
	}

}
