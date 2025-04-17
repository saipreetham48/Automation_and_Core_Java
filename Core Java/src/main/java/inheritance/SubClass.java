package inheritance;

import accessModifiers.Student;

public class SubClass extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc=new SubClass();
		System.out.println(sc.id);
		sc.getId();
		sc.cake();
		

	}
	public  void cake() {
		getId();
	}

}
