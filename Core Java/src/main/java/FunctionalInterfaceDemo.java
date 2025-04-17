

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	//functional interface is an interface which has maximum of one abstract method and unlimited number of non abstractt methods
	//annaotated with functional interface
	//eg:javalib/java.util.function:consumer,supplier etc
	void drive();
	default void sound() {
		
	}
	default void horn()
	{
		
	}
	private void honk() {
		
	}
	static void gear() {
		
	}

}
