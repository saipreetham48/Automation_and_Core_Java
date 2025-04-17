package collectionsDemo;

import java.util.*;

public class Prac1 {

//	public static void main(String[] args) {
//		String name = "Sai preetham Reddy";
//		char[] ch = name.toCharArray();
//		Set<Character> character = new TreeSet<Character>();
//		for (Character character2 : ch) {
//			character.add(character2);
//		}
//		System.out.println(character);
	//for hash set space,a,A,b,B.......
	//for linkedhashset insertion order
	//for treeset space,A,B,C...,a,b,c,.....
//
//	}
	
	public static void main(String[] args) {
		int[] arr= {45,87,9,87,4,3,65,87};
		Set<Integer> i=new TreeSet<Integer>();
		for (Integer integer : arr) {
			i.add(integer);
		}
		System.out.println(i);
	}

}
