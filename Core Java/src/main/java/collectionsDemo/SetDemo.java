package collectionsDemo;

import java.util.*;

public class SetDemo {
	// Set-It an interface which stores unique elements of data,doesnot allow duplicates

	public static void main(String[] args) {
		// Hashset-internally implementing hashmap and hashmap internally implementing
		// array of nodes(key,value)
		// Hashset->HashMap-->Array of nodes(key,value)
		//LinkedHashset->Linkedhashmap->link of  nodes
		//Treeset->Treemap->Binary tree
		// HashSet<Integer> hs=new HashSet<>();
		Set<Integer> hs = new HashSet<>();
		hs.add(2);

		hs.add(66);
		hs.add(2);

		hs.add(45);

		hs.add(23);

		hs.add(3);
		//System.out.println(hs);
		//hs.remove(45);//to remove- send value not index
		//System.out.println(hs.remove(45));
		//System.out.println(hs);
		//System.out.println(hs.contains(23)); //verification
//		for (Integer integer : hs) {
//			System.out.println(integer);
//			
//		}
		
		//LinkedHashset will maintain the insertion order
		//Treeset will maintain sorted order.
		//ts.first,ts.last,ts.pollfirst,ts.polllast
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(98);
		ts.add(7);
		ts.add(65);
		ts.add(4);
		//System.out.println(ts);//sorted order
		
		//System.out.println(ts.first());
		//System.out.println(ts.last());
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
//		System.out.println(ts);
//		System.out.println(ts.subSet(2, 56).remove(7));
//		System.out.println(ts);
		//System.out.println(ts.descendingSet());
		int arr[] = {45,87,9,34,9,45,9,56,78,56};
		System.out.println(Arrays.toString(duplicEle(arr)));
		
		

	}
	public static int[] duplicEle(int[] arr) {
		HashSet<Integer> hs1=new HashSet<Integer>();
		for (Integer integer : arr) {
			hs1.add(integer);
		}
		
		int[] org=new int[hs1.size()];
		int i=0;
		for (int ij : hs1) {
			
			org[i++]=ij;
		}
		return org;
	}
	
	


}
