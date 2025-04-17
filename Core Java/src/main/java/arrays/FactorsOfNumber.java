package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FactorsOfNumber {
	// add all the factors of a number into an array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				arr[count] = i;
				count++;
			}

		}
		System.out.println();
		System.out.println("count is:" + count);

		arr = Arrays.copyOf(arr, count);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}
}
