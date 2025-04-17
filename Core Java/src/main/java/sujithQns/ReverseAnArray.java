package sujithQns;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[]= {43,86,5,9,85,34};
		int rev[]=new int[arr.length];
		int index=0;
		for (int i = arr.length-1; i >=0; i--) {
			rev[index++]=arr[i];
		}
		System.out.println(Arrays.toString(rev));

	}

}
