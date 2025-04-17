package strings;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input:");
		String inp = sc.nextLine();
		inp.trim();
		String[] str = inp.split(" ");
		// System.out.println("output:"+Arrays.toString(str));
		System.out.println("output:" + str.length);
		sc.close();
	}

}
