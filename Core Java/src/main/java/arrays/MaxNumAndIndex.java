package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumAndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values in array:");
		int largestNumber=arr[0];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:"+Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
				index=i;
			}
			
		}
		System.out.println("Largest number:"+largestNumber);
		System.out.println("Index is:"+index);
		sc.close();
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i+1; j < arr.length; j++)
		 * { if(arr[i]>arr[j]) { int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; }
		 * 
		 * }
		 * 
		 * } System.out.println("Sorted array:"+Arrays.toString(arr));
		 * System.out.println("Maximum number:"+arr[arr.length-1]);
		 */

	}

}
