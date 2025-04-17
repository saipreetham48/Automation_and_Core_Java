package collectionsDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		/*
		 * LIFO-last in first out-stack FIFO-first in first out-queue
		 * 
		 * stack is a class in java which implements the list interface and extends the
		 * vector class and also represents the LIFO principle we can only create empty
		 * stack we cant intialize any size in stack always create with parameterless
		 * constructor.
		 * 
		 * duplicates allowed
		 * null values allowed
		 * insertion order
		 */
		Stack<String> books = new Stack<String>();
		/*
		 * books.add("Red"); books.add("Black"); books.add(0, "White");
		 * 
		 * //books.remove(0);
		 * 
		 * //books.remove("Red"); //books.set(0, "Orange"); System.out.println(books);
		 */

		/*
		 * 
		 * we wont use normal methods in stack but can use special methods
		 * 
		 * push pop peek search
		 * push is to add elements
		 * peek-it will return last element 
		 * pop-it will remove last element
		 * search-in lifo,upper element returns 1 .
		 * 
		 * 
		 */
		books.push("red");
		books.push("Black");
		books.push("White");
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books);
		System.out.println(books.search("red"));
		
	}

}
