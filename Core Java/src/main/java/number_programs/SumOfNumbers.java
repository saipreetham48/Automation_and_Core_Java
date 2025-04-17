package number_programs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting Range:");
		int start = sc.nextInt();
		System.out.println("Enter the ending range:");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			sum += i;

		}
		System.out.println("Sum of the numbers in teh range is:" + sum);
		sc.close();

	}

}
