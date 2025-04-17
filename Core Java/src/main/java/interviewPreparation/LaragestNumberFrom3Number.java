package interviewPreparation;

import java.util.Arrays;

public class LaragestNumberFrom3Number {

	public static void main(String[] args) {
		int a=10,b=20,c=18;
		int arr[]=new int[] {a,b,c};
		Arrays.sort(arr);
		System.out.println("Largest number in 3 numbers is:"+arr[arr.length-1]);
	}

}
//write a code to read a property file
//write a program to find all the duplicate character and their count in astring
//write a program to remove all the white spaces from a string
//write a program to sort all the elements of an array in descending order
//query to find second largest salary
//update query
//write a sql sub query to join employee (t1,t2,t3) and return the table 3 values
//create sql table|sql command
//move all zeroes to the end of the array.given an array of integers ,move all zeroes to the end of the array.push all the zeroes of the given array to the end of the array
//eg input:myarr={2,5,0,4,2,7,0,0,1,9,4}
//output:myarray={2,5,4,2,7,1,9,4,0,0,0}