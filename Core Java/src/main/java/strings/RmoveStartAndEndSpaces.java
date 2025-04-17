package strings;

import java.util.Scanner;

public class RmoveStartAndEndSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		String str = sc.nextLine();
		System.out.println("output:" + str.trim());

		sc.close();
	}

}
