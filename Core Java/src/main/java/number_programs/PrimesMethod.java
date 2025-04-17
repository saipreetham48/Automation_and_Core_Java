package number_programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrimesMethod {
	static int counter = 0;

	public static int[] getPrimes(int start, int end) {

		int[] primes = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) { // Number is prime if it has exactly two divisors (1 and itself)
				primes[counter] = i; // Store the prime number in the array
				counter++;
			}
		}
		primes = Arrays.copyOf(primes, counter);
		System.out.println("Primes:" + Arrays.toString(primes));

		return primes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a method to return an array of prime numbers which takes input as 2
		// parameters (Start,end)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting point:");
		int start = sc.nextInt();
		System.out.println("Enter ending point:");
		int end = sc.nextInt();
		getPrimes(start, end);

		sc.close();
	}

}
