package interviewPreparation;

import java.util.Scanner;

public class pineApples {
	
	    public int countConsonantWraps(String s) {
	        int count = 0;
	        for (int i = 1; i < s.length() - 1; i++) {
	            if ("aeiou".indexOf(s.charAt(i)) != -1 && 
	                "aeiou".indexOf(s.charAt(i - 1)) == -1 && 
	                "aeiou".indexOf(s.charAt(i + 1)) == -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the input");
	    	String s=sc.next();
	        System.out.println(new pineApples().countConsonantWraps(s));   // Output: 1
	    }
	}



