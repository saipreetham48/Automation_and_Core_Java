package strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");

		String input = sc.nextLine();
		String revInput = "";
		for (int i = input.length() - 1; i >= 0; i--) {

			revInput += input.charAt(i);

		}
		System.out.println("Reversed string:" + revInput);

		if (revInput.equals(input)) {
			System.out.println("It is a palindrome");
		} else
			System.out.println("It is not a palindrome");
		sc.close();

	}

}
