package interviewPreparation;

//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
import java.util.*;

public class UserMainCode {
    public  int countUniqueWeights(int input1) {
        Set<Integer> currentWeights = new HashSet<>();
        currentWeights.add(0); // Starting weight

        for (int i = 0; i < input1; i++) {
            Set<Integer> newWeights = new HashSet<>();
            for (int weight : currentWeights) {
                newWeights.add(weight + 3); // Add 3 kg
                newWeights.add(weight * 2); // Multiply by 2
            }
            currentWeights = newWeights; // Update with new set of weights
        }

        return currentWeights.size(); // Return count of unique weights
    }

    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the input");
    	int y1=sc.nextInt();
    	System.out.println("Output for input " + y1 + ": " + new UserMainCode().countUniqueWeights(y1)); // Output: 3
    	
    	
    }
}

