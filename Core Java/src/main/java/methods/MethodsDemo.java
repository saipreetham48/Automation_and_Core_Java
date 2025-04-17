package methods;

public class MethodsDemo {
	int a = 9;
	int b = 10;

	public void add() {
		System.out.println(a + b);
	}
	
	public int add1(int a , int b) {
		a = this.a;
		b = this.b;
		
		return a + b ;
		
	}
	int c = a;

	public static void main(String[] args) {
		MethodsDemo obj=new MethodsDemo();
		System.out.println(obj.add1(8, 9));
		System.out.println(obj.firstLetter("sujith", "Simha", "Sai"));
		
	}
	
	public char[] stringToArray(String name) {
		return name.toCharArray();
	}
	
	char[] dummy = stringToArray("Sai");
	
	public String firstLetter(String name1,String name2,String name3) {
		String str=String.valueOf(name1.charAt(0)) + String.valueOf(name2.charAt(0));
		return str;
	}

}
