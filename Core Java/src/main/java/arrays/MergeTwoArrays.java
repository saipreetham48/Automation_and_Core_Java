package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1:");
		int size1 = sc.nextInt();
		String arr1[] = new String[size1];

		System.out.println("Enter the values in array1");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.next();
		}
		System.out.println("Enter the size of array2:");
		int size2 = sc.nextInt();
		String arr2[] = new String[size2];
		System.out.println("Enter the values in array2:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.next();
		}

		System.out.println("Input:" + Arrays.toString(arr1));
		System.out.println("Input:" + Arrays.toString(arr2));

		String[] res = new String[size1 + size2];
		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			res[arr1.length + i] = arr2[i];
		}

		System.out.println("Output:" + Arrays.toString(res));
		sc.close();
	}

}
