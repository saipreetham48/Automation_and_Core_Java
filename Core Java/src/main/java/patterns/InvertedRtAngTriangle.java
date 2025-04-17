package patterns;

import java.util.Scanner;

public class InvertedRtAngTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}

	}

}



//       i       j
//       1       5
//       2       4
//       3       3
//       4       2
//       5       1