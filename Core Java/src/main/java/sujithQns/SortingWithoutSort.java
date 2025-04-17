package sujithQns;

import java.util.Arrays;

public class SortingWithoutSort {

	public static void main(String[] args) {
		int arr[] = { 34, 76, 54, 87, 9, 21, 34 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("Sorting order without using sort method is: " + Arrays.toString(arr));
	}

}
