 package pojoAndBeanClass;

public class PojoDemo {
	public int id;
	protected String name;
	private float salary;
	//we have 2 ways to set the values 1.constructor 2.setters
	
	public void setSalary(float salary) {
		this.salary=salary;
	}
	
	public float getSalary() {
		return salary;
	}
	

}
