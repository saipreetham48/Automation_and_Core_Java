package interviewPreparation;

public class InterviewLinkdn4 {

	public static void main(String[] args) {
//		Input: This is a string
//		Output: 13
		String str="This is a string";
		int size=str.length();
		String arr[]=str.split(" ");
		int spaceLength=arr.length;
		System.out.println("output:"+(size-(spaceLength-1)));
	}

}
