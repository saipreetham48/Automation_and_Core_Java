package interviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
//		int num=12345;
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println("Reversed number is:"+rev);
		
		//using string buffer
		int n=14345;
		System.out.println("Reversed number:"+new StringBuffer(String.valueOf(n)).reverse());
	}

}
