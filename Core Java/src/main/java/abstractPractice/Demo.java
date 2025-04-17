package abstractPractice;

public class Demo extends Abstract1{
	public int sum() {
		System.out.println("In sum method");
		return 0;
	}

	public static void main(String[] args) {
		Demo abs =new Demo() ;
		System.out.println(abs.div());
		/*
		 * System.out.println(abs.sub()); System.out.println(abs.sum());
		 */
		
			
	}

}
