package inputOutput;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int a = sc.nextInt();
//		System.out.println("A : "+a);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Name is:"+name);
		
		System.out.println("ENter School");
		String school = sc.nextLine();
		System.out.println(school);
		sc.close();
	}
	

}
