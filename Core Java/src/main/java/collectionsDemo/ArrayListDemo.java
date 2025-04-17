package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Integer> al1=new ArrayList<Integer>(); al1.add(5); al1.add(1, 6);
		 * System.out.println(al1); System.out.println(al1.size());
		 */
		//ArrayList<Integer> al1=new ArrayList<Integer>(200);

		Integer[] arr=new Integer[] {2,4,5,2,7};
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(arr));
		al1.add(null);
		al1.get(3);
		//same methods as vector
		
		//synchronisation 
		
		Collections.synchronizedList(al1);
		System.out.println(al1);

	}
	//same as vector but size is increased by 50 percent
	//by default no synchronisation
	//null values allowed
	//duplicate values allowed 
	//insertion order

}
