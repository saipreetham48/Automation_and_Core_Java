package operators;

public class Oper {
	public static void main(String[] args) {
		int sf= 32;
		
		System.out.println(sf++);//32

		System.out.println(sf++);//33

		System.out.println(sf);//34
		System.out.println(--sf + sf++);//33+33=66
		System.out.println(--sf);//33
		System.out.println(sf++);//33
		System.out.println(sf++);//34
	}

}
