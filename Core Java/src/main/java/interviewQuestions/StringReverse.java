package interviewQuestions;

public class StringReverse {
	//input=JavaCoding
	//output=gnidoCavaJ

	public static void main(String[] args) {
		String input="JavaCoding";
//		String reversed="";
//		
//		for (int i = input.length()-1; i >=0; i--) {
//			reversed+=input.charAt(i);
//			
//		}
//		
//		System.out.println("ReversedString:"+reversed);
//		StringBuilder sb=new StringBuilder(input);
//		System.out.println(sb.reverse());
		
		StringBuffer sb=new StringBuffer(input);
		System.out.println(sb.reverse());

	}

}
