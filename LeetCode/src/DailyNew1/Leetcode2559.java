package DailyNew1;

public class Leetcode2559 {

	

	    // Function to check if a character is a vowel
	    boolean isVowel(char c) {
	        return "aeiou".indexOf(c) != -1;
	    }

	    public int[] vowelStrings(String[] words, int[][] queries) {

	        // Precompute the count of vowel strings up to each index
	        int n = words.length;
	        int[] prefixSum = new int[n + 1];
	        for (int i = 0; i < n; i++) {
	            String word = words[i];
	            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
	                prefixSum[i + 1] = prefixSum[i] + 1;
	            } else {
	                prefixSum[i + 1] = prefixSum[i];
	            }
	        }

	        // Process each query
	        int[] result = new int[queries.length];
	        for (int i = 0; i < queries.length; i++) {
	            int l = queries[i][0];
	            int r = queries[i][1];
	            result[i] = prefixSum[r + 1] - prefixSum[l];
	        }

	        return result;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
