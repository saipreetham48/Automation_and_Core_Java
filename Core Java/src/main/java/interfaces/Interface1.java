package interfaces;

public interface Interface1 {
	int a = 10;

	int add();

	int p1();

	int p2();

	int p3();

	int p4();

	default  void mul() {
		System.out.println("In mul");
	}

	static void div() {

	}

	
	/* -->interface:An interface is a blueprint of a class.
	 * -->Any method in interface by default its public.
	 * Real time example:
	 * -- we are creating one calulator,for this we need to first prepare the business document or guidelines document
	 * --eg.in tha document we only mention perform sum,perform sub,perform mul,perform div etc.
	 * --here we are only providing high level of that operation like what to do and we are not writing how to do. till java 7.
	 * 
	 * --Eg. in class we have  how to do in detail to perform any operation
	 * --but in interface we dont have that detail implementation (how to do)
	 * --that's why we can say class is implementers of interface. 
	 * -->if we add any extra method in interface business document ,whoever implementing that document will impact till java 7
	 * -->from java 8 ,in interfaces -not only what to do ,we can write how to do also with the help of default or static.
	 * -->If we have common implementation in some default codes so duplication takes place so java introduced private implementation method in 1.9 for code reusuability.
	 * -->we cannot create object to the interfaces
	 * -->we can extends a interface with other interfaces. eg:interface3 extends interface1,interface2
	 * -->we cant implements the interface with other interfaces.eg:interface3 implements interface1,interface2. 
	 * 
	 * 
*/	 
}
