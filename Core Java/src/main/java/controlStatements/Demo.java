package controlStatements;

public class Demo {
	int a = 234;
	int b = 324;

	public static void main(String[] args) {
		//int a = 234;
		int b = 324;
		int c=10;
//		if(a<b) {
//			System.out.println("correcgt");
//		}
//		else {
//			System.out.println("wrong");
//		}
		int i =1;
		for (; i < c; ) {
			System.out.println(i);
			break;
		}
//		for(int i=0;i<=10;i=i+2)
//		{
//			
//			System.out.println(i);
//			
//		}
	    
		while(c <= 20) {
			System.out.println(c);
			c++;	
			continue;
		}
		System.out.println(c);
		
		int arr[] = { 1,5,67,87};
		for (int j : arr) {
			System.out.println(j);
		}
		String str[]= {"Sai","Sujith","Reddy"};
		for (String string : str) {
			System.out.println(string);
		}
	}
}