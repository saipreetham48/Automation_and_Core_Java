package patterns;

import java.util.Scanner;

public class NumTriangleSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		/*
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <=i; j++) {
		 * System.out.print(i+" ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();

		}

	}

}
