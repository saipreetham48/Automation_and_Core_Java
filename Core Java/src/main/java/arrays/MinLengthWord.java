package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		String str[]=new String[size];
		
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < str.length; i++) {
			str[i]=sc.next();
		}
		
		System.out.println("String Original array:"+Arrays.toString(str));
		int index=0;
		String minLenWord=str[0];
		
		for (int i = 1; i < str.length; i++) {
			if(minLenWord.length()>str[i].length()) {
				minLenWord=str[i];
				index=i;
			}
		}
		System.out.println("Min length word:"+minLenWord);
		System.out.println("Index:"+index);

	}

}
