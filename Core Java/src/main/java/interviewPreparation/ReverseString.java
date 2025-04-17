package interviewPreparation;

public class ReverseString {

	public static void main(String[] args) {
		String str="sai preetham reddy";
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			rev+=str.charAt(str.length()-1-i);
		}
		System.out.println("Reversed String:"+rev);
	}

}
