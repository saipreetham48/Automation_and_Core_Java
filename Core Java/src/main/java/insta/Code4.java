package insta;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code4 {

	public static void main(String[] args) {
		//given an array of integers where some elemnets are repeated multiple times,find and print all elements that 
		//appear an even number of times in the array.if no element is repeated an even number of times ,print -1
		//input:arr=[1,2,3,2,3,3,4,4,4,4]
		//output:2,4
		
		int arr[]= {1,2,3,2,3,3,4,4,4,4};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		Set<Integer> keys=map.keySet();
		System.out.print("Output:");
		for (Integer key : keys) {
			if(map.get(key)%2!=0) {
				System.out.print("-1");
				return;
			}
			else
				System.out.print(key+" ");
			
			
		}
		
		
	}

}
