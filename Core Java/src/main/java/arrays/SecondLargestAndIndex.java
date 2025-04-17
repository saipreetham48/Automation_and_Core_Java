package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values in array:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:"+Arrays.toString(arr));
		int largestNumber=arr[0];
		int secondLargestNumber=arr[0];
		int largestIndex=0;
		int secondLargestIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largestNumber) {
				secondLargestNumber=largestNumber;
				largestNumber=arr[i];
				secondLargestIndex=largestIndex;
				largestIndex=i;
				
			}
			else if (arr[i]>secondLargestNumber) {
				secondLargestNumber=arr[i];
				secondLargestIndex=i;
			}
			
		}
		System.out.println("Largest"+largestNumber);
		System.out.println("Second largest"+secondLargestNumber);
		System.out.println("largest index"+largestIndex);
		System.out.println("Second largest index"+secondLargestIndex);
		sc.close();

	}

}
