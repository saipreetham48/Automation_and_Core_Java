package collectionsDemo;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	//Map is used to store the information in the form of key-value pairs
	//no duplicate keys
	//duplicate values are allowed
	
	
	/*
	 *---implementation of hashTable,HashMap,LinkedHashmap and TreeMap is same 
	 *
	 *1.hashtable-Keys in decending order
	 *2.HashMap-Sorting order
	 *3.Linked HashMap-Insertion order
	 *4.TreeMap-Sorting order
	*/

	public static void main(String[] args) {
		//creation of a map
		//Map<Integer, String> m=new TreeMap<Integer, String>();
		//Map<Integer, String> m=new LinkedHashMapMap<Integer, String>();
		//Map<Integer, String> m=new HashMap<Integer, String>();
		Map<Integer, String> m=new Hashtable<Integer, String>();
		
		//addition of elemnts into the map
		m.put(106, "Sai");
		//m.put(null, null);//if value is null it will throw nullpointer exception
		//m.put(null, "San");//Cannot invoke "Object.hashCode()" because "key" is null
		m.put(102, "Simha");
		m.put(101, "Sai");
		m.put(103, "Sujith");
		
		System.out.println(m);
		
//		//Retrieval of keys from the map
//		
//		Set<Integer> keys=m.keySet();
//		for (Integer key : keys) {
//			System.out.println(key);
//			
//		}
//		System.out.println();
//		//Retrieval of values from the map
//		
//		Collection<String>values=m.values();
//		for (String value : values) {
//			System.out.println(value);
//			
//		}
//		System.out.println();
//		//retrieval of value from the map based on key
//		System.out.println(m.get(102));
//		
//		for (Integer key : keys) {
//			System.out.println(key+">>>>"+m.get(key));
//			
//		}
//		
//		//deletion of element from the map
//		System.out.println(m.remove(102));
//		System.out.println(m);
//		
//		//verification of key in a map
//		
//		System.out.println(m.containsKey(101));//true
//		System.out.println(m.containsKey(345));//false
//		//verification of value in a map
//		System.out.println(m.containsValue("Sujith"));//true
//		System.out.println(m.containsValue("Skhjj"));//false
		
		//for updation again add value using existing key
//		m.put(101, "jumbo");
//		System.out.println(m);
		
//		m.putIfAbsent(101, "Sdjffj");
//		System.out.println(m);
		
//		m.replace(101, "Dhaw");
//		System.out.println(m);
		//to remove entire map
		//m.clear();
//		System.out.println(m.size());
//		
//		Set<Entry<Integer, String>> entries=m.entrySet();
//		for (Entry<Integer, String> entry : entries) {
//			Integer key=entry.getKey();
//			String value=entry.getValue();
//			System.out.println(key+">>>>>>>"+value);
//			
//		}
		
		
		
		
		
		

	}

}
