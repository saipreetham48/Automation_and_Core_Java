package number_programs;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swap x="+x + " "+"y="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap x="+x +" " +"y="+y);
		

	}

}
