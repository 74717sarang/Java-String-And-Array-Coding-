package DailyNew1;

public class Leetcode1014 {

	public static int maxScoreSightseeingPair(int[] values) {
		int maxScore = 0;
		int maxI = values[0]; // Keeps track of the best value of (values[i] + i) so far

		for (int j = 1; j < values.length; j++) {
			maxScore = Math.max(maxScore, maxI + values[j] - j);
			maxI = Math.max(maxI, values[j] + j); // Update maxI for the next iteration
		}

		return maxScore;
	}
	
	
	

	public static void main(String[] args) {

		int[] values = {8,1,5,2,6};
	       //output 11	
		System.out.println(maxScoreSightseeingPair(values));
		System.out.println();
		
	}
}
