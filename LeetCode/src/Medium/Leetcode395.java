package Medium;

import java.util.Arrays;

public class Leetcode395 {

    	    public int longestSubstring(String s, int k) {
    	        return help(s, 0, s.length(), k);
    	    }

    	    public int help(String s, int start, int end, int k) {
    	        if (end - start < k) // Corrected base case
    	            return 0;
    	        
    	        int[] count = new int[26];
    	        for (int i = start; i < end; i++) {
    	            count[s.charAt(i) - 'a']++;
    	        }
    	        
    	        for (int i = start; i < end; i++) {
    	            if (count[s.charAt(i) - 'a'] < k) { // If count of the current character is less than k
    	                int j = i + 1;
    	                while (j < end && count[s.charAt(j) - 'a'] < k)
    	                    j++;
    	                // Make recursive calls and return the maximum result
    	                return Math.max(help(s, start, i, k), help(s, j, end, k));
    	            }
    	        }
    	        
    	        return end - start; // All characters in the current substring meet the requirement
    	    }
    	
    


    
	public static void main(String[] args) {
		
		String s = "your input string";
		int start=0;int end=s.length();
		int[] count = new int[26];
		for (int i = start; i < end; i++) {
			if (Character.isLetter(s.charAt(i))) { // Ensure only letters are counted
			count[s.charAt(i) - 'a']++;
		}
		}
		for(char i='a';i<='z';i++) {
		System.out.print(" "+i+" ");}
		System.out.println();
		System.out.println(Arrays.toString(count));
		
		
		////////
		
		int k = 3; // example value for k 
		Leetcode395 solution=new Leetcode395();
		System.out.println("ck");
		int result = solution.longestSubstring(s, k); System.out.println(result);
	}
}
