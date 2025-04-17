package strings;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");

		String outputText = "";

		for (int i = 0; i < strArr.length; i++) {
			String revWord = "";
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				revWord += strArr[i].charAt(j);

			}
			if (i != strArr.length - 1) {
				outputText += revWord + " ";
			} else {
				outputText += revWord;
			}
		}

		System.out.println("Output:" + outputText);
		sc.close();
	}

}
