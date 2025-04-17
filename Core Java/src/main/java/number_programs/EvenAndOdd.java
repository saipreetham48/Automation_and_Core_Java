package number_programs;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		// 1. print only even and odd numbers
		// 2. add all the even numbers only and ptint its sum
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value:");
		int start = sc.nextInt();
		System.out.println("Enter the ending value:");
		int end = sc.nextInt();
		int sum = 0;
		System.out.printf("Even numbers from %d to %d are : ", start, end);
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Total sum of even numbers is : " + sum);
		sc.close();

	}

}
