package strings;

import java.util.Arrays;

public class StringsDemo {
	public static void main(String[] args) {
		// String is sequence of characters it is a non primitive data type
		// String is immutable due to security reason and string pool constrain
		// if we perform actions like concatination the original string gets unaffected
		String name = "Sai Preetham Reddy";// Literal
		String school = new String("Sri Chaitanya");// Object
		school = "preetham";
		System.out.println(name);
		System.out.println(school);
		String pet = new String();// String so = "";
		System.out.println(pet.isBlank());
//		Scanner sc  = new Scanner(System.in);
//		String kid = sc.nextLine();
//		System.out.println("Kid anme is: "+kid);
//		sc.close();
		System.out.println(pet.concat(school));
		System.out.println(name.charAt(4));
		System.out.println(name.toLowerCase());
		char[] so = name.toCharArray();

//		String man = name.concat("zdfb");
		System.out.println(name);
		System.out.println(so);//
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
//		int a = 13;
//		a = 324;
//		name = "somre";
		String nameu = name.toLowerCase();
		System.out.println(nameu);
		// suppose if 2 memberts having same location as banglore the one member changes
		// location to hyd then the other member location also gets affected
		StringBuilder br = new StringBuilder("SDSFdfvjdbv");
		br.deleteCharAt(3);
		br.append("dsf");
		System.out.println(br);

		StringBuffer buf = new StringBuffer("prefeth");
		char let = buf.charAt(4);
		System.out.println(let);

		String man = "     Sai Is a good boy     ";
		String[] co = man.split(" ");
		char[] ko = man.toCharArray();
		System.out.println(Arrays.toString(co));
		System.out.println(Arrays.toString(ko));
		System.out.println(man.trim());
		System.out.println(man.strip());
//		for(String c : man.split(" ") ) {
//			
//		}
		for (int i = 0; i < man.length(); i++) {
			System.out.println(man.charAt(i));
		}
		// What is the difference between == and equalsTo
		// Str name = "hello";
		// name = name + "world";
//		syso(name);
//		StringBu gu = new stBu("hello");
//		gu.append("world");
//		syso(gu);
	}

}
