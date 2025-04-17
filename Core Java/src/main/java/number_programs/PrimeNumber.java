package number_programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value:");
        int start = sc.nextInt();
        System.out.println("Enter last value:");
        int end = sc.nextInt();
        System.out.printf("Prime numbers between %d to %d are:", start, end);

        int[] primes = new int[end - start + 1]; // Create an array to hold the prime numbers
        int counter = 0; // Counter to keep track of the number of primes found

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

        // Resize the array to fit the number of primes found
        primes = Arrays.copyOf(primes, counter);

        // Print the prime numbers stored in the array
        System.out.println(Arrays.toString(primes));

        sc.close();
    }
}
