package arrays;

import java.util.Arrays;

public class OddAndEven {

	public static void main(String[] args) {
		//store even and odd numbers in an array 
		int[] arr= {10,9,27,37,48,60,14};
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;


			}
			else {
				oddCount++;
			}

		}
		int[] evenArray=new int[evenCount];//4
		int[] oddArray=new int[oddCount];//3
		int evenIndex=0;
		int oddIndex=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]%2==0) {
				evenArray[evenIndex++]=arr[j];
			}
			else {
				oddArray[oddIndex++]=arr[j];
			}


		}


		System.out.print("Even numbers are:");
		System.out.println(Arrays.toString(evenArray));

		System.out.print("Odd numbers are:");
		System.out.println(Arrays.toString(oddArray));

		//		System.out.println("Even numbers are:");
		//		for(int k=0;k<evenArray.length;k++)
		//		{
		//			System.out.print(Arrays.toString(k)+" ");
		//		}
		//		System.out.println();
		//		System.out.println("Odd numbers are:");
		//		for(int m=0;m<oddArray.length;m++) {
		//			System.out.print(oddArray[m]+" ");
		//		}


	}

}




//public static void main(String[] args) {
//	//store even and odd numbers in an array 
//	int[] arr= {10,9,27,37,48,60,14};
//	
//	int[] evenArray=new int[arr.length];//4
//	int[] oddArray=new int[arr.length];//3
//	int evenIndex=0;
//	int oddIndex=0;
//	for (int j = 0; j < arr.length; j++) {
//		if(arr[j]%2==0) {
//			evenArray[evenIndex++]=arr[j];
//		}
//		else {
//			oddArray[oddIndex++]=arr[j];
//		}
//
//
//	}
//
//
//	System.out.print("Even numbers are:");
//	System.out.println(Arrays.toString(evenArray));
//
//	System.out.print("Odd numbers are:");
//	System.out.println(Arrays.toString(oddArray));

