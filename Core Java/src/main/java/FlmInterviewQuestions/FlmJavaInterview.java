package FlmInterviewQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class FlmJavaInterview {

	public static void main(String[] args) {
//		//command line argument
//		for (String string : args) {
//			System.out.println(string);
//		}
		
		//taking user input
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the integer");
//		int a=sc.nextInt();
		
		//fahrenheit to celsius
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter temperature in fahreneit:");
//		Float temperature=sc.nextFloat();
//		temperature=((temperature-32)*5)/9;
//		System.out.println("In celsius: "+temperature);
		
		//swap 2nos using 3variables
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		int a=sc.nextInt();
//		System.out.println("Enter the second number:");
//		int b=sc.nextInt();
//		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.printf("After swapping a is %d ",a);
//		System.out.println("After swapping b is:"+b);
		//swap without 3rd variable
//		int a=8;
//		int b=5;
//		a=a+b;//13
//		b=a-b;//8
//		a=a-b;//5
//		
//		a=a*b;//40
//		b=a/b;//5
//		a=a/b;//8
		
		//adding big integer
//		String str1= "74678930029873645678947389";
//		String str2="948756748394875674839";
//		BigInteger inp1=new BigInteger(str1);
//		BigInteger inp2=new BigInteger(str2);
//		System.out.println(inp1.add(inp2));
		
		//largest of 3 numbers
//		int a=15,b=65,c=9;
//		if(a>b && a>c) {
//			System.out.println("a is largest number");
//		}else if(b>a && b>c) {
//			System.out.println("b is the largest number");
//		}else if(c>a && c>b) {
//			System.out.println("c is the largest number");
//		}else
//		{
//			System.out.println("given numbers are ot different");
//		}
		
		//factorial
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int factorial=sc.nextInt();
		int fact=1;
		for (int i = factorial; i <=factorial; i--) {
			fact *=factorial;
		}
		System.out.println("Factorial of a given number is:"+factorial);
	}

}
