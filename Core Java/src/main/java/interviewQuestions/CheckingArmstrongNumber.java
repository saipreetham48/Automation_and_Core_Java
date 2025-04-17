package interviewQuestions;

import java.util.Scanner;

public class CheckingArmstrongNumber {
	// input=153
	// output=1cube+5cube+3cube==input(153) is armstrong

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int num = sc.nextInt();
		int temp = num;
		double result = 0;

		while (temp != 0) {
			int rem = temp % 10;
			result = result + Math.pow(rem, 3);
			temp = temp / 10;
		}
		if (result == num) {
			System.out.println(num + " is an armstrong number");
		} else
			System.out.println(num + " is not an armstrong number");
		sc.close();

	}

}
