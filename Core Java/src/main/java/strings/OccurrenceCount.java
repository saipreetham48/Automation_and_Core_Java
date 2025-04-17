package strings;

import java.util.Scanner;

public class OccurrenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the targetted array:");
		char targetChar = sc.next().charAt(0);
		// char[] charArray=str.toCharArray();
		System.out.println("input:" + str);
		System.out.println("Enter tagetted array:" + targetChar);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetChar) {
				
				count++;
			}
		}
		/*
		 * for (int i = 0; i < charArray.length; i++) { if(charArray[i]==targetChar) {
		 * count++; } }
		 */
		System.out.println("output:" + count);
		sc.close();
	}

}
