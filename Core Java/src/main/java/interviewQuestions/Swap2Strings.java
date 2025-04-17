package interviewQuestions;

public class Swap2Strings {
	//input1=Java
	//input2=Coding
	//output=>input1=Coding,input2=Java

	public static void main(String[] args) {
		String input1="Java";
		String input2="Coding";
		input1=input1+input2;//JavaCoding
		
		input2=input1.substring(0, (input1.length()-input2.length()));
//		input1=input1.substring(input2.length(), input1.length());
		input1=input1.substring(input2.length());
		
		System.out.println("After swapping Input1 is:"+input1);
		System.out.println("After swapping Input2 is:"+input2);

	}

}
