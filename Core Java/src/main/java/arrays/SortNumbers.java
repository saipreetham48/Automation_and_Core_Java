package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
	// sort without using sort method
	public static void main(String[] args) {
//  int arr[]= {10,56,87,9,34,23,44};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		//{3,35,9,8732}
		for (int i = 0; i < size ; i++) {
			for (int j = i+1; j < size  ; j++) {
				if (arr[i] > arr[j ]) {
					int temp = arr[i];
					arr[i] = arr[j ];
					arr[j ] = temp;
				}

			}

		}

		System.out.println("Sorted array:" + Arrays.toString(arr) + " ");
		
		
		for (int k = 0; k <size/2; k++) {
			int temp=arr[k];
			arr[k]=arr[size-1-k];
			arr[size-1-k]=temp;
			
		}
		System.out.println("Reverse order:"+Arrays.toString(arr));
		sc.close();

	}
	

}
