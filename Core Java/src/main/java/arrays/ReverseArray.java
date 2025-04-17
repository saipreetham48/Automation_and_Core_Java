package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	// Reverse the given array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[size - 1 - i];
			arr[size - 1 - i] = temp;
		}
		System.out.println("Reversed array:" + Arrays.toString(arr));
		sc.close();
		// {9,76,43,68)
		int revArr[] = new int[size];
		for (int i = size - 1; i >= 0; i--) {
			revArr[i] = arr[size - i - 1];

		}
		System.out.println("Original array " + Arrays.toString(revArr));
		if (revArr[0] == arr[0]) {
			System.out.println("Both are equal");
		}
	}

}
