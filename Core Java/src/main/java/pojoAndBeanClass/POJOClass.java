package pojoAndBeanClass;

import java.util.Arrays;

public class POJOClass {

	public static void main(String[] args) {
		PojoDemo pd=new PojoDemo();
		pd.setSalary(154284.98f);
		pd.id=100;
		pd.name="Sai";
		
		PojoDemo pd2=new PojoDemo();
		pd2.setSalary(18456.98f);
		pd2.id=101;
		pd2.name="Sai reddy";
		
		PojoDemo pd3=new PojoDemo();
		pd3.setSalary(84584.98f);
		pd3.id=104;
		pd3.name="Sai preetham";
		 PojoDemo[] p=new PojoDemo[] {pd,pd2,pd3};
		 for (PojoDemo po : p) {
			 System.out.println("Salary:"+po.getSalary());
			
		}
		 
		

	}

}
