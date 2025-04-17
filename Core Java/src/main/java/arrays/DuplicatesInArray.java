package arrays;

import java.util.Arrays;

public class DuplicatesInArray {
	// {34,5,785,5,34,49874}
	// find the duplicates and store it in an array {34,5}
	// remove duplicates {34,5,785,49874}
	// completely removing duplicates {785,49874}
	public static void main(String[] args) {
		int arr[] = { 34, 5, 785, 5,34, 34, 49874 };
		int count=0;
		//int store[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j >i+1; j--) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
		}
		int store[]=new int[count];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j >i+1; j--) {
				if(arr[i]==arr[j]) {
					store[index++]=arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(store));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int dup[] = new int[arr.length];
//
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					dup[index++] = arr[i];
//				}
//
//			}
//
//		}
//		dup = Arrays.copyOf(dup, index);
//		System.out.println("Only duplicates" + Arrays.toString(dup));

	}

}
