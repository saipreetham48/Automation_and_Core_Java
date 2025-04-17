package sujithQns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EachCharCount {

	public static void main(String[] args) {
		
//		Elephant=E-2 L-1 P-1 H-1 A-1 N-1 T-1
//		String str="Elephant".toUpperCase();
//		//String upCase=str.toUpperCase();
//		char[] ch=str.toCharArray();
//		System.out.println("Count of each char in a string:");
//		for (int i = 0; i < ch.length; i++) {
//			int count=1;
//			for (int j =i+1; j < ch.length; j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//			}
//			System.out.println(ch[i]+"-"+count);
//		}
		//System.out.println(Arrays.toString(ch));
		String str="hackerearth".toUpperCase();
		char[] ch=str.toCharArray();
		Map<Character,Integer> dup = new Hashtable<Character, Integer>();
		for (Character c : ch) {
			
			dup.put(c, dup.getOrDefault(c, 0) + 1);
			if(dup.get(c)>1) {
				System.out.println(c);//first repeated char
				break;
			}
		}
		
		for (Character key: dup.keySet()) {
			if(dup.get(key)>0) {
				System.out.println(key+"="+dup.get(key));
			}
		}
		
		}

}
