package insta;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Code2 {

	public static void main(String[] args) {
		//given an array of integers,replace each element with its rank in the array.The rank of a number is its posituion in the sorted unique values,with ranks starting from 1.
		//input:1 5 8 15 8 25 9
		//output:1 2 3 5 3 6 4
		int[] arr= {1,5,8,15,8,25,9};
		Set<Integer> set=new TreeSet<Integer>();
		for (int  num: arr) {
			set.add(num);
		}
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int rank=1;
		for (int num : set) {
			map.put(num, rank++);
		}
		System.out.print("output:");
		for (int order : arr) {
			System.out.print(map.get(order)+" ");
		}
		//System.out.println(map);
	}

}
