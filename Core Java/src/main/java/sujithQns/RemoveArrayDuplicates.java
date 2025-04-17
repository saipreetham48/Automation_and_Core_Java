package sujithQns;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RemoveArrayDuplicates {
	

	public static void main(String[] args) {
		//int arr[]= {45,76,98,76,5,45};
//		Map<Integer, Integer> m=new TreeMap<Integer, Integer>();
//		for (Integer i : arr) {
//			m.put(i,m.getOrDefault(i, 0)+1 );
//			
//		}
//		System.out.println(m);
//		for (Integer key : m.keySet()) {
//			if(m.get(key)>1)
//				System.out.println(key);
//		}
		String arr[]= {"Sai","Sujith","Sai","Simha"};
		Map<String, Integer> m=new TreeMap<String, Integer>();
		for (String i : arr) {
			m.put(i,m.getOrDefault(i, 0)+1 );
			
		}
		System.out.println(m);
		for (String key : m.keySet()) {
//			if(m.get(key)>1)
//				System.out.println(key);//only duplicates
//			if(m.get(key)<2)
//				System.out.println(key);//other than duplicates
		}
		
		Set<String> s=new HashSet<String>();
		for (String string : arr) {
			s.add(string);
		}
		System.out.println(s);
		
	}

}
