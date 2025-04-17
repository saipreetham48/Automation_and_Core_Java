package pojoAndBeanClass;

import java.io.Serializable;

public class BeanDemo implements Serializable {
	private int id=45;
	private String name="Cake";
	private float marks=43.56f;
	public BeanDemo() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	
	

}
