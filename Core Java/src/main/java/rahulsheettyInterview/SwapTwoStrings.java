package rahulsheettyInterview;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1=sc.nextLine();
		System.out.println("Eneter the string2:");
		String str2=sc.nextLine();
		//str1=sai  str2=reddy  
		//str1=str1+str2;//saireddy
		//str2=str1.substring(0,str1.length()-str2.length())
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length(), str1.length());
		System.out.println("After swapping Str1 is: "+str1);
		System.out.println("After swapping Str2 is: "+str2);

	}

}
