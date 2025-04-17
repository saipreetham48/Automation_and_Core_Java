package interviewPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayReverse {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of array:");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		int rev[]=new int[size];
//		System.out.println("Enter the numbers in the array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for (int i = 0; i < rev.length; i++) {
//			rev[i]=arr[arr.length-1-i];
//		}
//		System.out.println("Reversed array:"+Arrays.toString(rev));
//		
//		
		Stack<Integer> s=new Stack<Integer>();
		s.add(34);
		s.add(3);
		s.add(87);
		s.add(8);
		System.out.println("Reversed order:"+s);
	}

}
