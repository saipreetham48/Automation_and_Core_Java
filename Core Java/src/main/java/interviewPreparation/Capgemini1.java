package interviewPreparation;

public class Capgemini1 {

	public static void main(String[] args) {
		//input:"abcd"
		//output:"aabbccdd"
		//input:"abcd"
		//output:"abbcccdddd"
		String input="abcd";
		char[] ch=input.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.print(ch[i]);
//			}
//		}
		for (int i = 0; i < ch.length; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[i]);
			}
		}
	}

}
