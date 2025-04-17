package strings;

import java.util.Scanner;

public class MaxLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		String maxWordLength = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if (maxWordLength.length() < strArr[i].length()) {
				maxWordLength = strArr[i];
			}
		}
		System.out.println("Max length word is:" + maxWordLength);
		sc.close();
	}

}
