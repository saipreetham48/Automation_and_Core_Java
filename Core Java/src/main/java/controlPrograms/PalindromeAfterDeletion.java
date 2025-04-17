package controlPrograms;

import java.util.Scanner;

public class PalindromeAfterDeletion {

    private static boolean canFormPalindrome(int[] freq) {
        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

   
    public static int findMinLengthToDelete(String s) {
        int n = s.length();
        int minLength = Integer.MAX_VALUE; 

       
        int[] freq = new int[26];

        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        
        if (canFormPalindrome(freq)) {
            return 0;
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               
                int[] tempFreq = freq.clone();
                for (int k = i; k <= j; k++) {
                    tempFreq[s.charAt(k) - 'a']--;
                }

               
                if (canFormPalindrome(tempFreq)) {
                    
                    minLength = Math.min(minLength, j - i + 1);
                }
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine(); 

        
        for (int test = 0; test < t; test++) {
            System.out.println("Enter the string:");
            String s = sc.nextLine();

           
            int result = findMinLengthToDelete(s);

           
            System.out.println(result);
        }

        sc.close();
    }
}
