package arrays;

import java.util.Arrays;

public class OnlyPositive {
	//store only positive numbers from the given array
	public static void main(String[] args) {
		int arr[]= {34,76,98,-2,65,-9};
		int pos[]=new int[arr.length];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				
				pos[index++]=arr[i];
			}
		}
		System.out.println("Positive numbers are:");
		pos=Arrays.copyOf(pos, index);
		System.out.println(Arrays.toString(pos));
	}


}
