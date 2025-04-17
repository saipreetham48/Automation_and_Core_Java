package sujithQns;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		int a=24,b=12;
		int gcd=1;
		for (int i = 1; i <=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
			
			
		}
		System.out.printf("Gcd of %d and %d is %d ",a,b,gcd);
		
		
		
	}

}
