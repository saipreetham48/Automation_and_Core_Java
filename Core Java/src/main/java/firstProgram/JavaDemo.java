package firstProgram;

public class JavaDemo {
	public JavaDemo() {
		System.out.println("In Constructor");
	}
 	public static void main(String args[]) {
//		JavaDemo jd = new JavaDemo();

		System.out.println("First hello");
		System.err.println("SOmething");
	}

	static {
		System.out.println("In static block");
	}

	{
		System.out.println("Instance Block");
	}

}

class Dam {

}