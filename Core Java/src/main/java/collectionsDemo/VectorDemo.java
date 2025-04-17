package collectionsDemo;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(null);
		
		
		//Vector v1=new Vector();
		//Vector v1=new Vector(20);
		/*
		 * Object[] arr=new Object[] {1,2,4,5,6}; Vector v1=new
		 * Vector(Arrays.asList(arr)); v1.add("guru"); int sum=0; for (int i = 0; i <
		 * v1.size(); i++) { sum+=(Integer)v1.get(i);
		 * 
		 * }
		 * 
		 * Here we will get error here so java identified this problem and introduced generics in 1.5 version Vector<Integer> v1=new Vector<>;
		 * 
		 * System.out.println(v1); System.out.println(v1.capacity());
		 */
		
		/*
		 * v1.add("sai"); v1.add("sujith"); v1.add(0, "Simha"); Vector v2=new Vector();
		 * v2.add("BALRAM"); v2.add("pink"); Vector v3=new Vector(); v3.add("pink");
		 * v3.add("BALRAM"); System.out.println(v1.capacity());
		 * 
		 */
			/*
			 * for (int i = 0; i < v2.size(); i++) { v1.add(v2.get(i));
			 * 
			 * }
			 */
		// v1.addAll(1,v2);
		//System.out.println(v1);
		//System.out.println(v1.get(0));
		//v1.remove(0); or
		//v1.remove("sai");
		//System.out.println(v1);
		//v1.removeAll(v2);
		//v1.clear();
		//System.out.println(v1.contains("sai"));
		//System.out.println(v2.containsAll(v3)); 
		//v1.set(0, "cake");
		//.out.println(v1); //update
		//System.out.println(v1.size());
		//System.out.println(v1.capacity());
		
		//index,lastIndex ,isEmpty,firstElement,lastElement
		
		//Object[] arr=v1.toArray();
		//System.out.println(Arrays.toString(arr));
		
	}
	
	//array size increased by 100percent 
	//insertion order
	//allow duplocate elements
	//allow null values 
	//synchonous by default
	
	

}
