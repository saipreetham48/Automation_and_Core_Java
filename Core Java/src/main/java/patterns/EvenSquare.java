package patterns;

import java.util.Scanner;

public class EvenSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		//2 4
		//6 8
		int k=2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(k+" ");
				k+=2;
			}
			System.out.println();
		}
		

	}

}
