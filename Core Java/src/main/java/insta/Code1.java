package insta;

import java.util.Iterator;
import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		//given an integer N,find the sum of all prime number from 2 to N 
		//input:10
		//output:17
		//prime numbers between 2 to 10 are 2,3,5,7
		//sum=2+3+5+7=17
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		int sum=0;
		for (int i = 2; i < n; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				sum+=i;
			}
		}
		System.out.println("Output : "+sum);//17+11+13+17+19
	}

}
