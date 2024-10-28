package Daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//leetcode 2501
public class LongestSquareStreakinanArray {

	public int longestSquareStreak(int[] nums) {
		// Remove duplicates and sort in descending order
		Set<Integer> uniqueNums = new HashSet<>();
		for (int num : nums) {
			uniqueNums.add(num);
		}

		// Convert the unique elements set to a sorted list
		List<Integer> sortedNums = new ArrayList<>(uniqueNums);
		Collections.sort(sortedNums, Collections.reverseOrder());

		// Map to store the length of the longest streak starting from each number
		Map<Integer, Integer> streakMap = new HashMap<>();
		int maxStreak = 0;

		for (int num : sortedNums) {
			if (streakMap.containsKey(num)) {
				// Skip if already computed
				continue;
			}

			int streak = 1;
			int nextNum = num;

			// Calculate streak for each number
			while (uniqueNums.contains(nextNum * nextNum)) {
				nextNum *= nextNum;
				streak++;
			}

			streakMap.put(num, streak);
			maxStreak = Math.max(maxStreak, streak);
		}

		return maxStreak < 2 ? -1 : maxStreak;
	}

	public static void main(String[] args) {

	}
}
