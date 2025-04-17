package interviewPreparation;

import java.util.Hashtable;
import java.util.Map;

public class Dummy1 {

	 public static void main(String[] args) {
	        String str = "hackerearth"; // Input string

	        findDuplicateCharacters(str);
	    }

	    public static void findDuplicateCharacters(String str) {
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new Hashtable<>();

	        // Count occurrences of each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print duplicate characters
	        System.out.print("Output: ");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
	}
//int y1 = 2;
//System.out.println("Output for input " + y1 + ": " + findUniqueWeights(y1)); // Output: 3
//
//int y2 = 3;
//System.out.println("Output for input " + y2 + ": " + findUniqueWeights(y2)); // Output: 6
	
		
		

	


