package DailyNew1;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1072 {

	public static int maxEqualRowsAfterFlips(int[][] matrix) {
		Map<String, Integer> patternCount = new HashMap<>();
		int maxRows = 0;

		for (int[] row : matrix) {
			StringBuilder pattern = new StringBuilder();
			StringBuilder complementPattern = new StringBuilder();

			for (int value : row) {
				pattern.append(value);
				complementPattern.append(1 - value); // Flip 0 to 1 and 1 to 0
			}

			String patternStr = pattern.toString();
			String complementStr = complementPattern.toString();

			// Count the occurrence of patterns
			patternCount.put(patternStr, patternCount.getOrDefault(patternStr, 0) + 1);
			patternCount.put(complementStr, patternCount.getOrDefault(complementStr, 0) + 1);

			// Update the maximum rows that can be made equal
			maxRows = Math.max(maxRows, patternCount.get(patternStr));
		}

		return maxRows;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1 }, { 1, 0 }, { 0, 1 } };
		System.out.println("EqualsRows::"+maxEqualRowsAfterFlips(matrix)); // Output: 3
	}
}
