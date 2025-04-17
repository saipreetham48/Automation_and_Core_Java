package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFibonocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the fibonocci series:");
		int fibLength = sc.nextInt();
		int[] arr = new int[fibLength];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];

		}

		System.out.println(Arrays.toString(arr));

		// to retrieve numbers not in array format
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		sc.close();

	}

}
