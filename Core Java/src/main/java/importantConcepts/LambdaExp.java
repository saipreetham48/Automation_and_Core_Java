package importantConcepts;

public class LambdaExp {

	public static void main(String[] args) {
		Audi a=new Audi();
		//a.drive(80,"Audi");
		Car c1=new Car() {
			
			@Override
			public int drive() {
				System.out.println("Honda is called");
				return 8;
				
			}
		};
		c1.drive();
		
		Car c2=() -> 100;
		
	
		System.out.println(c2.drive());

	}

}
class Audi implements Car{

	@Override
	public int drive() {
		System.out.println("Audii is called");
		return 70;
		
	}
	
}

@FunctionalInterface
interface Car{
	public int drive();
	
}
