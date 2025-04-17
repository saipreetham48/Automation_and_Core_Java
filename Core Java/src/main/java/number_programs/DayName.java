package number_programs;

import java.util.Scanner;

public class DayName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day name:");
		String day = sc.next();
		if (day.equalsIgnoreCase("Sunday") | day.equalsIgnoreCase("Saturday")) {
			System.out.println("Its a weekend");
		} else
			System.out.println("Its weekday");
		sc.close();

	}

}
