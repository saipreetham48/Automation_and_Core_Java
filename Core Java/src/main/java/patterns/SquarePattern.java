package patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i <=5; i++) { for (int j = 0; j <= 5; j++) {
		 * System.out.print(" * ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		/*
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <= n; j++) {
		 * System.out.print(j+" ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		/*
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <= n; j++) {
		 * System.out.print(i+" ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		sc.close();

	}

}
