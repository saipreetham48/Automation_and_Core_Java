package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		System.out.println("Original array:" + Arrays.toString(a));
		int[] revArr = new int[size];
		for (int i = 0; i < revArr.length; i++) {
			revArr[i] = a[a.length - 1 - i];

		}
		System.out.println("Reversed array:" + Arrays.toString(revArr));
		sc.close();

	}

}
