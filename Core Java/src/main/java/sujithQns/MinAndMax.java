package sujithQns;

import java.util.TreeSet;

public class MinAndMax {

	public static void main(String[] args) {
		int arr[]= {23,65,87,67,5,4,98};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for (Integer adding : arr) {
			ts.add(adding);
			
		}
		System.out.println(ts);
		System.out.println("Minimum value: "+ts.first());
		System.out.println("Maximum value: "+ts.last());
	}

}
