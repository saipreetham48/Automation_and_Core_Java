package strings;

import java.util.Scanner;

public class FileExtension {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Output:" + str.substring(str.lastIndexOf(".") + 1, str.length()));
		sc.close();
	}

}
