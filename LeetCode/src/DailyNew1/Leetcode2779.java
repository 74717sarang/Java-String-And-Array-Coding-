package DailyNew1;

import java.util.Arrays;

public class Leetcode2779 {

	public static int maximumBeauty(int[] nums, int k) {
		int count = 0;
		Arrays.sort(nums);
		int maxBeauty = 0;
		int start = 0;
		for (int end = 0; end < nums.length; end++) {
			while (nums[end] - nums[start] > 2 * k) {
				start++;
			}
			maxBeauty = Math.max(maxBeauty, end - start + 1);

		}

		return maxBeauty;
	}

	public static void main(String[] args) {

//		Input: nums = [4,6,1,2], k = 2
//				Output: 3

		int[] nums = { 4, 6, 1, 2 };
		int k = 2;

		System.out.println(maximumBeauty(nums, k));
	}
}
