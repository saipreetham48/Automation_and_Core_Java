package number_programs;

import java.util.Scanner;

public class SwapwithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x=sc.nextInt();
		System.out.println("Enter the value of y:");
		int y=sc.nextInt();
		System.out.println("Before swap x="+x +" "+"y="+y);
		if(x<y) {
		//x=10 y=20
		x=x+y;//30
		y=x-y;//30-20=10
		x=x-y;//30-10=20
		
		System.out.println("After swap x="+x+" "+"y="+y);
		}
		else
		{
			//x=20 y=10
			y=y+x;//30
			x=y-x;//30-20=10
			y=y-x;//30-10=20
			
			System.out.println("After swap x="+x+" "+"y="+y);
		}

	}

}
