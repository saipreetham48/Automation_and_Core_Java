package number_programs;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your score:");
		int score = scanner.nextInt();
		if(score >85)
		{
			System.out.println("Student secured First class");
		}
		else if (score >70 && score <=85) {
			System.out.println("Student secured Second class");
		}
		else if (score >35 && score <=70) {
			System.out.println("Student secured third class");
		}
		else if (score==35) {
			System.out.println("Student is passed");
		}
		else
			System.out.println("Student is failed");

	}

}
