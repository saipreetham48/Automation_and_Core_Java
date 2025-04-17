package interviewQuestions;

public class RemovejunkORSpecialChars {

	public static void main(String[] args) {
		String s="*&^%$#$%^&*hsfretto09874%^&*<ygff>";
		//regex[^a-zA-Z0-9](cap is not )
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
