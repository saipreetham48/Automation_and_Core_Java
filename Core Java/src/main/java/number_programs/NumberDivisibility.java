package number_programs;

import java.util.Scanner;

public class NumberDivisibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divisible number:");
		int divisible=sc.nextInt();
		System.out.println("Enter the Starting point:");
		int start=sc.nextInt();
		System.out.println("Enter the ending point:");
		int end=sc.nextInt();
		for (int i = start; i <=end; i++) {
			if(i%divisible==0)
			{
				System.out.println(i);
			}
			
		}
		sc.close();

	}

}
