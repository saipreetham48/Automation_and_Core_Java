package practicePatterns;

public class Tricky1 {

	public static void main(String[] args) {
		int n=4;
		char small='a';
		char cap='A';
		/*
		 * A-65  i1,j1=cap
		 * B-66  i2,j1=small
		 * C-67  i2,j2=cap
		 * D-68  i3,j1=cap
		 * E-69  i3,j2=small
		 * F-70  i3,j3=cap
		 * G-71  i4,j1=small
		 * H-72  i4,j2=cap
		 * I-73  i4,j3=small
		 * J-74  i4,j4=cap
		 * 
		 * logic (i+j)%2==0;//caps
		 * 
		 */
		for (int i = 1; i <=n; i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
				
					System.out.print(cap);
					
				}
				else {
					
					System.out.print(small);
					
				}
				small++;
				cap++;
			
				
			}
			System.out.println();
			
		}
	}

}
