package number_programs;

import java.util.Scanner;

public class Factors {

	
	// Should print nall the factors of thr given number 
	//eg - 24 has 2, 3, 4, 6, 8, 12 are the factors
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= sc.nextInt();
		System.out.printf("The factors of %d are:",number);
		int sum=0;
		 for (int i = 1; i <=number; i++) {
			 if(number%i==0) {
				 System.out.print(i+" ");
				 sum+=i;
			 }
			
		}
		 System.out.println();
		 System.out.println("The sum of the factors of the given number is:"+sum);
		 sc.close();
			
		
	}
}
