package arrays;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		
	
	// {32,354,543,43,4,43,43,54} if I give 3 then the array should be {43,4,43....}
	int[] a= {32,354,543,43,4,43,43,54};
	int d=3;
	int[] temp=new int[a.length];

	for (int i =0 ; i < a.length; i++) {
		temp[i]=a[d];
		d++;
		
	}
	System.out.println(Arrays.toString(temp));

}}
