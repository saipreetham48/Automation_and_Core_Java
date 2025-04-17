package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithwordsAtOddOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		String[] oddArr = new String[(strArr.length / 2)];
		int index = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 != 0) {
				oddArr[index++] = strArr[i];
			}

		}
		System.out.println("Resultant array:" + Arrays.toString(oddArr));
		sc.close();
	}

}
