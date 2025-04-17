package abstractPractice;

public class AbstractClassDemo {

	public static void main(String[] args) {
		//Two t2=new Two();
		//int x=t2.calc(7, 8);
		One t =new Three();
		int x=t.calc(9, 6);
		t.display(x);
		
		

	}
}
	 abstract class One{
		 int x=6,y=5;
		public abstract int calc(int x,int y);
		
		public void display(int x) {
			System.out.println("From one x:"+x);
			
		}
	}
	
	 class Two extends One{

		@Override
		public int calc(int x, int y) {
		
			return (this.x*this.y);
		}
		
	}
	 class Three extends One{

		@Override
		public int calc(int x, int y) {
			// TODO Auto-generated method stub
			return (x+y);
		}
		public void display(int x) {
			System.out.println("From Three X:"+x);
		}
	}


