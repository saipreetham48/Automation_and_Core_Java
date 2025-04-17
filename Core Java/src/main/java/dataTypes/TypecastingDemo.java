package dataTypes;

public class TypecastingDemo {

	public static void main(String[] args) {
		byte b=10;//-128 to 127
		short s=500;
		int i=300;
		float f=25.1f;
		long l=76488994;
		double d=52.55;
		char ch='A';
		boolean bo=true;
		f=l;
		//i=(int)l;
		
		b=(byte)i;
		System.out.println(b);
		//boolean cannot insert or convert to any above datatype bcz of incompatability
		//byte b2=b+b; this is called type promotion 
		//int =b+s+ch any operations between these 3
		
		/*
		 * 
		 * interview:
		 * 
		 * sys('A'+'B');it is integer because of type promotion
		*/	}

}
