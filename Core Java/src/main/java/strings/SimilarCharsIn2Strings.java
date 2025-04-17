package strings;

import java.util.Scanner;

public class SimilarCharsIn2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		String str1 = sc.nextLine();
		System.out.println("Enter the 2st string:");
		String str2 = sc.nextLine();
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			char tempChar = str1.toLowerCase().charAt(i);
			if (str2.toLowerCase().indexOf(tempChar) >= 0) {
				result += str1.charAt(i);
			} else {
				result += "+";
			}
		}
		System.out.println("resultant Output: " + result);

		sc.close();
	}

}
