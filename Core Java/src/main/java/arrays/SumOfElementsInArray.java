package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in an array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("Elements in an array" + Arrays.toString(arr));
		for (int i = 0; i < size; i++) {
			sum += arr[i];

		}
		System.out.println("Sum of elements in an array:" + sum);
		sc.close();

	}

}
