package DailyNew1;

public class Leetcode1422 {

	    public static int maxScore(String s) {
	        int n = s.length();
	        int maxScore = 0;
	        int onesCount = 0, zerosCount = 0;

	        // Count total number of '1's in the string
	        for (char c : s.toCharArray()) {
	            if (c == '1') onesCount++;
	        }

	        int leftZeros = 0, leftOnes = 0;

	        // Traverse the string and calculate the score for each split
	        for (int i = 0; i < n - 1; i++) {
	            if (s.charAt(i) == '0') {
	                leftZeros++;
	            } else {
	                leftOnes++;
	            }

	            int rightOnes = onesCount - leftOnes;
	            int score = leftZeros + rightOnes;

	            maxScore = Math.max(maxScore, score);
	        }

	        return maxScore;
	    }

	
	
	
	public static void main(String[] args) {

//		Input: s = "011101"
//				Output: 5
		
		String s="011101";
		System.out.println(maxScore(s));
		
	}

}
