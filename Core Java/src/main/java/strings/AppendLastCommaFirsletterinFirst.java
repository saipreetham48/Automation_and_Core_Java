package strings;

import java.util.Scanner;

public class AppendLastCommaFirsletterinFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String fName = sc.nextLine();
		System.out.println("Enter the last name:");
		String lName = sc.nextLine();
		System.out.println(lName + "," + fName.charAt(0));
		sc.close();

	}

}
