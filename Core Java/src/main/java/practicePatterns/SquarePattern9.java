package practicePatterns;

public class SquarePattern9 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.printf("%3d",(i*j));
			}
			System.out.println();
			
			/*       j=1 j=2 j=3 j=4 j=5
			 * 
			 *  i=1   1   2   3   4   5 
			 *  i=2   2   4   6   8   10
			 *  i=3   3   6   9   12  15
			 *  i=4   4   8   12  16  20
			 *  i=5   5   10  15  20  25
			 */
			
		}

	}

}
