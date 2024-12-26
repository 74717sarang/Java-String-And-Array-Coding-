package DailyNew1;

import java.util.HashMap;
import java.util.Map;

public class Leetcode494 {

	public int findTargetSumWays(int[] nums, int target) {

		return findways(nums, target, 0, 0, new HashMap<>());
	}

	public int findways(int[] nums, int target, int index, int currentSum, Map<String, Integer> memo) {

		if (index == nums.length) {
			return currentSum == target ? 1 : 0;
		}

		String key = index + "," + currentSum;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int add = findways(nums, target, index + 1, currentSum + nums[index], memo);
		int subtract = findways(nums, target, index + 1, currentSum - nums[index], memo);

		memo.put(key, add + subtract);
		return memo.get(key);

	}

	public static void main(String[] args) {

		Leetcode494 solution = new Leetcode494();
		int[] nums = { 1, 1, 1, 1, 1 };
		int target = 3;
		int result = solution.findTargetSumWays(nums, target);
		System.out.println("Number of ways to achieve the target sum: " + result); // Output: 5;
	}

}
