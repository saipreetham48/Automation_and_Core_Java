import java.util.Iterator;

public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		//Employee t1=new Employee();
		//t1.start();
//		Employee e1=new Employee();
//		Thread t1=new Thread(e1,"Emp");
//		t1.start();
//			
//		System.out.println(Thread.activeCount());
		Runnable r1=() ->{
			for(int i=0;i<5;i++)
				System.out.println("Hiiii");
				
				
			};
			Runnable r2=() ->{
				for(int i=0;i<3;i++)
					System.out.println("Hello");
					
					
				};
				
		
		Thread t1=new Thread(r1);
		System.out.println(t1.getState());
		
		
		
		Thread t2=new Thread(r2);
		t1.start();
		System.out.println(t1.getState());
		//t1.join();
		t1.sleep(10000);
		t2.start();
		System.out.println(t1.getState());


	}

}
//class Employee extends Thread{
//	public Employee(String name) {
//		super(name);
//	}
//	@Override
//	public void run() {
//		System.out.println("Employee method" +Thread.currentThread().getId()+">>>>"+Thread.currentThread().getName());
//	}
//	
//}
//class Employee implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("Employee method" +Thread.currentThread().getId()+">>>>"+Thread.currentThread().getName());
//		
//	}
//	
//}
