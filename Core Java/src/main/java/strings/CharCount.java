package strings;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");

		String word = sc.nextLine();
		System.out.println("output:"+word.length());
	
		/*
		 * int count = 0; for (int i = 0; i < word.length(); i++) { count++; }
		 * System.out.println("Output:" + count);
		 */
		sc.close();
	}

}
