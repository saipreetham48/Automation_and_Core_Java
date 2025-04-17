import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new StringBuilder(sc.nextLine()).reverse());
		sc.close();
//		String str="sai";
//		for(int i=0;i<str.length()-1;i++) {
//			str.charAt(i)=str.charAt(str.length()-1-i);
//		}

	}
	

}

//public static void main(String[] args) {
//	String str = "sai reddy";
//	String reverse = "";
//	for (int i = str.length() - 1; i >= 0; i--) {
//		reverse += str.charAt(i);
//
//	}
//	System.out.println("Reversed string:" + reverse);
//	if (str.equals(reverse))
//		System.out.println(str + "is a palindrome");
//
//	else
//		System.out.println(str + "is not a palindrome");
//
//}
