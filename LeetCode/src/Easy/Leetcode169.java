package Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode169 {

	public static int majorityElement(int[] nums) {

		// this two step Answer
		// Arrays.sort(nums);
		// return nums[nums.length/2];

		// time comple=O(1)
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int majority = nums.length / 2;
		for (Integer i : map.keySet()) {
			if (map.get(i) > majority)
				return i;
		}
		return 0;

	}

	public static void main(String[] args) {

//		Input: nums = [2,2,1,1,1,2,2]
//				Output: 2

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}

}
