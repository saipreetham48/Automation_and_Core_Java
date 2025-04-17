package collectionsDemo;


import java.util.*;

public class LinkedListDemo {
	//Combination of node(class) objects is known as linkedlist
	//each node object has 3 compartments 1.previous 2.item 3.nexts 
	//allows duplicate values
	//follows insertion order
	//allows null values
	// by default it is not synchronised ,but when we use collectionlist.synchronised explicitly
	//it is good for data manipulations
	//In java we use doubly linked list bcz we have previous and next so we can move in both back and forward directions
	//whereas in singly linkedlist we only have next so we cant go in backward direction.

	public static void main(String[] args) {
		//List<Integer> ll=new LinkedList<Integer>();
		//Deque<Integer> ll=new LinkedList<Integer>();
		//Queue<Integer> ll=new LinkedList<Integer>();
		//Collection<Integer> ll =new LinkedList<Integer>();
		//Iterable<Integer> ll=new LinkedList<Integer>();
		ArrayList<String> al=new ArrayList<String>();
		al.add("s1");
		al.add("S2");
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Y1");
		ll.add("Y3");
		ll.add(null);
		ll.add("Y3");//add
		ll.add(1, "YY");//add with index
		//ll.addAll(al);
		ll.addAll(1, al);//add all elemnts from another collection
		//ll.removeAll(al); //to remove all
		//ll.clear();//removes all the elements
		
		//ll.set(3, "DF");//to update the value
		//System.out.println(ll.get(1));//to retrieve the elements
		//System.out.println(ll.contains("Y2"));//verification
		System.out.println(ll);
		Collections.synchronizedCollection(ll);
		for (String string : ll) {
			System.out.println(string);
			
		}

	}

}
