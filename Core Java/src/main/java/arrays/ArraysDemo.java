package arrays;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		/*
		 * An array is a group of collection of elements with same data type
		 * we can access elements in an array with the help of their indexes
		 * and the index of an array starts with 0
		 */
//		int arr[]= {1,2,3,4};
//		System.out.println(Arrays.toString(arr));
//		System.out.println("Enter size of array");
//		int[] nums = new int[5];
//		nums[0] = 213;
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the size:");
//		int a=sc.nextInt();
//		
//		int arr[]=new int[a];
//		System.out.println("Enter values of array:");
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			arr[i]=sc.nextInt();
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		sc.close();
		
		//Multi dimensional array
		int rl[][] = {{1,2,3},{32,325,435}};
		System.err.println(rl[0][0]);
		int num[][] = new int[4][3];//4 internal arrays having 3 elements each
		System.out.println(num);//ref
		System.out.println(num[0]);//ref
		System.out.println(num[0][0]);//0
		System.out.println(Arrays.toString(num));//[[r1,[r2,[r3,[r4 ]
		System.out.println(Arrays.toString(num[0]));//[0,0,0]
		System.out.println(num.length);
		System.out.println(num[0].length);
		System.out.println(num[0][0]);
		int dum[][][] = {
				{{21,4132,25},{23,425,43}},
				{{45,4324,4225},{435,452,45}}
				};
		System.out.println(dum[1][1][1]);
		//{12,413,325,425
		//324,425,43
	    int[][] som = {
                {10, 20, 30 ,40},
                {50, 60, 70, 80, 90, 100},
                {110, 120}
                   };
	    System.out.println(som[1][4]);
	    int ar[] = {12,45,45,6546,3546,23,928423,9,823,8723};
	    System.out.println();
	    Arrays.sort(ar);
	    
	    System.out.println(Arrays.toString(ar));
	    System.out.println(ar[ar.length-1]);
	    
	}
	
	

}
