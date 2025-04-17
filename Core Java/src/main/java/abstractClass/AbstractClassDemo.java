package abstractClass;




public abstract class AbstractClassDemo {
	public abstract int sum() ;
	private void mod() {
		System.out.println("Mod");
		
	}
	
	

	public int sub() {
		mod();
		return 10;
	}
	
	
	/*	Abstract class-A class contains 0 or more abstract methods or concrete methods(normal methods).
	 * Abstract methods-Defined or unimplemented methods are known as abstract methods. with the of abstract keyword
	 * we cannot create an object to abstract class because of unimplemented(abstract) methods in it.
	 * If we are inheriting(extends) abstract class having abstract methods:we need to implement the abstract methods in it or make class abstract.
	 * 
	*/
	
}
