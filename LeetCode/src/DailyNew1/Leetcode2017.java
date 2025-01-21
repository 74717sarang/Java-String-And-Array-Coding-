package DailyNew1;

public class Leetcode2017 {

	public static long gridGame(int[][] grid) {
		int n = grid[0].length;
		long[] topPrefixSum = new long[n];
		long[] bottomPrefixSum = new long[n];

		// Calculate prefix sums for top and bottom rows
		topPrefixSum[0] = grid[0][0];
		bottomPrefixSum[0] = grid[1][0];

		for (int i = 1; i < n; i++) {
			topPrefixSum[i] = topPrefixSum[i - 1] + grid[0][i];
			bottomPrefixSum[i] = bottomPrefixSum[i - 1] + grid[1][i];
		}

		long result = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			long topPoints = topPrefixSum[n - 1] - topPrefixSum[i]; // Remaining points in the top row
			long bottomPoints = (i > 0) ? bottomPrefixSum[i - 1] : 0; // Collected points in the bottom row
			long maxPoints = Math.max(topPoints, bottomPoints); // Robot 2 picks the max
			result = Math.min(result, maxPoints); // Minimize the maximum points for Robot 2
		}

		return result;
	}

	
	public static void main(String[] args) {

		int[][] grid = { { 2, 5, 4 }, { 1, 5, 1 } };
		System.out.println(gridGame(grid));  //4
	}

}
