package abstractPractice;

public  abstract class Abstract1 {
	 abstract public int  sum();
	 public int sub() {
		 System.out.println("In sub concrete method");
		 return 5;
	 }
	 private int mul() {
		 System.out.println("IN mul");
		 return 2;
	 }
	 
	 public int div() {
		System.out.println( mul());
		 return 3 + sub();
	 }
	 
	 
	
	

}
