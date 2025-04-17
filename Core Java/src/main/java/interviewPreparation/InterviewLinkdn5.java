package interviewPreparation;

public class InterviewLinkdn5 {

	public static void main(String[] args) {
//		Input: Hello world
//		Output: World Hello
		String input="Hello world";
//		String str1=input.substring(6, input.length());
//		String str2=input.substring(0,(input.length()-str1.length()));
//		System.out.println("Output:"+str1+" "+str2);
		String str1="Hello";
		String str2="world";
		String temp;
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println(str1+" "+str2);
	}

}
