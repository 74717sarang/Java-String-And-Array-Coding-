package Medium;

//leetcode 53
public class MaximumSubArraySum {

	public static int maxSubArray(int[] nums) {
//		if (nums.length == 1) {
//			return nums[0];
//		}
		int sum = 0;
	        int max=0 ;
//		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(sum, max);
			if (sum < 0)
				sum = 0;
		}
		
		return max;
	}

	public static int maxSubArrayTest(int[] nums) {
//		int n = nums.length;
		int mx = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			mx = Math.max(mx, sum);
			if (sum < 0)
				sum = 0;
		}
		return mx;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int[]nums={5,4,-1,7,8};

		System.out.println("Sum::" + maxSubArray(nums));

		System.out.println("Sum::" + maxSubArrayTest(nums));

	}
}
