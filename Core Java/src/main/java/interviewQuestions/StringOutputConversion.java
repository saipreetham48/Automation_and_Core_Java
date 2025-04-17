package interviewQuestions;

import java.util.Arrays;
import java.util.Iterator;

public class StringOutputConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input:i love programming
		// ouput:I Love Programming
		String input = "sai Preetham reddy sujith";
		
		String[] str = input.split(" ");
		String output = "";
//		for (int i = 0; i < str.length; i++) {
//			// String output1=str[0].;
//
//		}
		System.out.println(capitalizeEachWord(input));
		char ch='a';
		System.out.println(String.valueOf(ch).toUpperCase());
		int arr[]= {23,54,76};
		System.out.println(arr.toString());
		
	}

	public static String capitalizeEachWord(String str) {
		String[] words = str.split(" ");
		StringBuilder capitalizedSentence = new StringBuilder();

		for (String word : words) {
			if (word.length() > 0) {
				capitalizedSentence.append(word.charAt(0))
						.append(word.substring(1).toLowerCase()).append(" ");
			}
		}

		return capitalizedSentence.toString().trim();

		// char[] ch=str.toCharArray();
		// System.out.println(Arrays.toString(str.split(" ")));

	}

}
