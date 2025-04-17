package sujithQns;

import java.util.Scanner;

public class StringInterview {

	public static void main(String[] args) {
		//take two parameters as string and give true or false as output
		//'aba' & 'aba'=true
		//'abb' & 'bba'=true
		//'bab' & 'ab'=false
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=sc.next();
		System.out.println("Enter second string:");
		String str2=sc.next();
		if(str1.length()==str2.length() & str1.contains(str2)) {
			System.out.println("'"+ str1 +"'" +" & "+"'"+ str2 +"'"+"=true");
		}
		else
			System.out.println("'"+ str1 +"'" +" & "+"'"+ str2 +"'"+"=false");
		sc.close();
		
	}

}
