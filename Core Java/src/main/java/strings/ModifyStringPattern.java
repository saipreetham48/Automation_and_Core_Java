package strings;

import java.util.Scanner;

public class ModifyStringPattern {

	public static void main(String[] args) {
		// input :Java is good l.age
		// output:JAVA si GOOD ega.l

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		String outputString = "";
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				outputString += strArr[i].toUpperCase();

			} else {
				
				for (int j = strArr[i].length() - 1; j >= 0; j--) {

					outputString += strArr[i].charAt(j);
				}

			}

			if (i != strArr.length - 1) {
				outputString += " ";
			}

		}
		System.out.println("Output string:" + outputString);
		sc.close();

	}

}
