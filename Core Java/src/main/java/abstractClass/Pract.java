package abstractClass;

public class Pract {

	public static void main(String[] args) {
		//Sai output:ias
		String str="hgyfgdgyugsug";
		String Rev="";
		for (int i = str.length()-1; i >= 0; i--) {
			Rev+=str.charAt(i);
		}
		System.out.println("Reversed string: "+Rev);
	}

}
