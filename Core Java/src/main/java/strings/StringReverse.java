package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		String str = sc.nextLine();
		String reverse = new String();
		// char[] ch=str.toCharArray();
		System.out.println("output: ");
		/*
		 * for (int i = str.length() - 1; i >= 0; i--) {
		 * System.out.print(str.charAt(i));
		 * 
		 * }
		 */
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);

		}
		System.out.println("Output:" + reverse);

		sc.close();
	}

}
