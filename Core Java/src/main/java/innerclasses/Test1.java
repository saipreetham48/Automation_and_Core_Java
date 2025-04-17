package innerclasses;

public class Test1 {
	private static int id =98;
	public static void main(String[] args) {
		
//		Test1 t1=new Test1();
//		Test2 t2=t1.new Test2();
//		t2.show();
		//for static innerclass object creation
		Test4 t4=new Test1.Test4();
		t4.kji();
		
		

	}

	public final class Test2 extends Test100{
		static int id=34;
		public void show() {
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(Test1.this.id);
		}
		public void display() {
			Test2 t=new Test2();
		}

	}

	private abstract class Test3 {

	}

	public static class Test4 {
		public void kji() {
			System.out.println("Kji method");
		}

	}

}
