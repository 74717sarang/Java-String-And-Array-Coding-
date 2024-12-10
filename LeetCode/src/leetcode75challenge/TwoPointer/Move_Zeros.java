package leetcode75challenge.TwoPointer;

import java.util.Arrays;

// leetcode 283
public class Move_Zeros {

	private static void moveZero(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while (count < nums.length) {
			nums[count++] = 0;
		}
	}

	public static void main(String[] args) {

//		Input: nums = [0,1,0,3,12]
//		Output: [1,3,12,0,0]

		int[] nums = { 0, 1, 0, 3, 12 };

		moveZero(nums);
//		for (int i : nums) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		System.out.println(Arrays.toString(nums));
	}

}
