package accessModifiers;

 public class Student {
	 protected int id=100;
	
	protected Student() {
		
	}
	 protected void getId() {
		System.out.println(id);
	}
	public static void main(String[] args) {
	Student s=	new Student();
	System.out.println(s.id);
	s.getId();
	}

	
	public void setId() {
		getId();
	}

}
