package arrays;

import java.util.Arrays;

public class EvenAndOddUsingCopyFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,9,27,37,48,60,14};
//		int even[]=new int[arr.length];
//		int odd[]=new int[arr.length];
		int evenIndex=0;
		int oddIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				//even[evenIndex++]=arr[i];
				evenIndex++;
			}
			else {
				//odd[oddIndex++]=arr[i];
				oddIndex++;
			}
			
			
		}
		int even[]=new int[evenIndex];
		int odd[]=new int[oddIndex];
		int e=0;
		int o=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even[e]=arr[i];
				e++;
				//evenIndex++;
			}
			else {
				odd[o]=arr[i];
				o++;
				//oddIndex++;
			}
			
			
		}
		System.out.println("Oddarray:"+Arrays.toString(even));
		System.out.println("Oddarray:"+Arrays.toString(odd));
		
//		System.out.print("Even numbers are:");
//		even=Arrays.copyOf(even, evenIndex);
//		
//		System.out.println(Arrays.toString(even));
//		System.out.print("Odd numbers are:");
//		odd=Arrays.copyOf(odd, oddIndex);
//		System.out.println(Arrays.toString(odd));

	}

}
