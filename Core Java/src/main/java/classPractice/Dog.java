package classPractice;

public class Dog {
	public String breed="German shepard";
	public int height =30;
	public int weight =40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *class-class is a blueprint in which the entire information of the class will be present.
		 *class has two members 1.variables 2.methods
		 *in real world every object has properties and actions 
		 *In java properties is reffered as variables and actions is referred as actions.
		 *Object is the superclass of any class in java 
		 */
		Dog dog=new Dog();
		System.out.println(dog.height);
		System.out.println(dog.breed);
		

	}

}
