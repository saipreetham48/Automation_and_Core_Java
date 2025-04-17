package interviewPreparation;

public class InterviewLinkdn3 {

	public static void main(String[] args) {
//		Input: This is a string
//		Output: gnirts a si sihT
		String str="This is a string";
		String output="";
		for (int i = str.length()-1; i >=0; i--) {
			output+=str.charAt(i);
		}
		System.out.println("Output:"+output);
	}

}
