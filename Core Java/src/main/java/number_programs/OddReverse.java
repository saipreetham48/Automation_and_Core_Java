package number_programs;

import java.util.Scanner;

public class OddReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start=sc.nextInt();
		System.out.println("Enter the last number:");
		int end=sc.nextInt();
		System.out.printf("the odd numbers from%d to %d are:",start,end);
		for(int i=end;i>=start;i--) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
			
	}

}
