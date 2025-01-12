package DailyNew1;

public class Leetcode1400 {

	    public boolean canConstruct(String s, int k) {
	        if (s.length() < k) return false; // Hint 1

	        int[] charCount = new int[26];
	        for (char c : s.toCharArray()) {
	            charCount[c - 'a']++;
	        }

	        int oddCount = 0;
	        for (int count : charCount) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	        }

	        return oddCount <= k; // Hint 2 and Hint 3
	    }
	    

	    public static void main(String[] args) {
	    	Leetcode1400 solution = new Leetcode1400();
	        System.out.println(solution.canConstruct("annabelle", 2)); // Output: true
	        System.out.println(solution.canConstruct("leetcode", 3));  // Output: false
	        System.out.println(solution.canConstruct("true", 4));      // Output: true
	    }
	

}
