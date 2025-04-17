package practicePatterns;

public class SquarePattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%4d", k);
				k++;

			}
			System.out.println();

		}

	}

}
