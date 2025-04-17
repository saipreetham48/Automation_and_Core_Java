
public class AnanymousObjects {
	String name="Sai";
	public  void greeting() {
		System.out.println("Welcome"+name);
	}

	public static void main(String[] args) {
		new AnanymousObjects().greeting();
		
		/*
		 * ananymous objects:an object whic is not referenced by any variable
		 * No.of lines is reduced
		 * advantages:If we are accessing only one method it is good
		 * disadvantages:If we have have more than one method ,referenced object is best(Student s1=new student())
		 * 
		 */
		

	}

}
