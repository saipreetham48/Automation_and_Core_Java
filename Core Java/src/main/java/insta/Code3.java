package insta;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		//a company manufacturers two-wheelers(TW) and four-wheelers(FW).Given.
		//v->total number of vehicles
		//W->total number of wheels
		//find the number of tw and fw produced
		//input1:200 540
		//Output:TW=130 FW=70
		//input 2:100 201
		//output 2:Invalid input
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number of vehicles");
		int vehicles=sc.nextInt();
		System.out.println("Enter number of wheels");
		int wheels=sc.nextInt();
		int TW;
		int FW;
		if(wheels%2!=0 || wheels>4*vehicles ||wheels<2*vehicles) {
			System.out.println("Invalid Output");
		}
		else {
			FW=(wheels-2*vehicles)/2;
			TW=vehicles-FW;
			System.out.println("TW="+TW +" "+"FW="+FW);
			
		}
			
	
		
	}

}
