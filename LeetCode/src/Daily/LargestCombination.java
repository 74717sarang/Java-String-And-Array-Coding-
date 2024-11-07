package Daily;

public class LargestCombination {

	// leetcode 2275
	public int largestCombination(int[] candidates) {
		int maxCount = 0;

		// Loop through each bit position (0 to 31 for integers)
		for (int bit = 0; bit < 32; bit++) {
			int count = 0;

			// Check each candidate to see if it has the current bit set
			for (int num : candidates) {
				if ((num & (1 << bit)) != 0) {
					count++;
				}
			}

			// Track the maximum count of candidates with a particular bit set
			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}

	public static void main(String[] args) {

	}
}
