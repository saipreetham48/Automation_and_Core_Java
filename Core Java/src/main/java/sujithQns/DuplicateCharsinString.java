package sujithQns;

public class DuplicateCharsinString {

	public static void main(String[] args) {
		//Reddy output:d
//		String ip="Zsjijrfu jrnjfhuhfu";
		String ip="reddy";
		char[] ch=ip.toCharArray();
		System.out.print("Duplicate chars in a string are:");
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = ch.length-1; j >i; j--) {
				if(ch[i]==ch[j] && ch[i] !=' ') {
					count++;
					ch[j]=0;
					
				}
				
			}
			if(count>1) {
				System.out.print(ch[i]+" ");
			}
			
		}
		
	}

}
