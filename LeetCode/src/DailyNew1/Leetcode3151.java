package DailyNew1;

public class Leetcode3151 {

	public static boolean isArraySpecial(int[] nums) {
		boolean tag = true;
		if (nums.length == 1)
			return true;

		for (int i = 1; i < nums.length; i++) {
			int last = nums[i - 1];
			if (last % 2 == 0) {
				if (nums[i] % 2 == 0) {
					return false;
				}
			} else {

				if (nums[i] % 2 != 0) {
					return false;
				}

			}

		}
		return true;
	}

	public static void main(String[] args) {
		
//		Input: nums = [4,3,1,6]
//				Output false
//				Explanation:
//				nums[1] and nums[2] are both odd. So the answer is false
		
		int[]nums = {4,3,1,6};
		System.out.println(isArraySpecial(nums));
		
	}

}
