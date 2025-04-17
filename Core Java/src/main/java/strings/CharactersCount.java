package strings;

import java.util.Scanner;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int lowerCount = 0;
		int upperCount = 0;
		int digitCount = 0;
		int spCharCount = 0;
		char[] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length; i++) {
			if (Character.isUpperCase(chArray[i])) {
				upperCount++;
			} else if (Character.isLowerCase(chArray[i])) {
				lowerCount++;

			} else if (Character.isDigit(chArray[i])) {
				digitCount++;
			} else {
				spCharCount++;
			}

		}
		System.out.println("Lowercase Count:" + lowerCount);
		System.out.println("uppercase Count:" + upperCount);

		System.out.println("Digits Count:" + digitCount);
		System.out.println("Special characters Count:" + spCharCount);
		sc.close();

	}

}
