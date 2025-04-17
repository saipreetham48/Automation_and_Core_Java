package number_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number =sc.nextInt();
		
		 for (int i = 1; i <=number; i++) {
			 factorial=factorial*i;

		}
		 System.out.println("The factorial value of a given number is:"+factorial);
		 sc.close();
		

	}

}
