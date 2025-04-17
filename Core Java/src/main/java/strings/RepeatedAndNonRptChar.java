package strings;

import java.util.Scanner;

public class RepeatedAndNonRptChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char firstRepeatedChar = ' ';
		char firstNonRepeatedChar = ' ';
		// canada
		//for(int i=0;i<6;i++)
		for (int i = 0; i < str.length(); i++) {
			char tempChar = str.charAt(i);//temp char =c;
			if (tempChar != ' ') {
				if (str.indexOf(tempChar) == str.lastIndexOf(tempChar)) //if(2==2)
				{
					if (firstNonRepeatedChar == ' ') {
						firstNonRepeatedChar = tempChar;
					}

				} else if (firstRepeatedChar == ' ') {
					firstRepeatedChar = tempChar;
				}
				if (firstNonRepeatedChar != ' ' && firstRepeatedChar != ' ') {
					break;
				}
			}

		}
		System.out.println("First repeated character:" + firstRepeatedChar);
		System.out.println("First Nonrepeated character:" + firstNonRepeatedChar);
		sc.close();

	}

}
