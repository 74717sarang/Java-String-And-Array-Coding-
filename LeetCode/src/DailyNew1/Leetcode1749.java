package DailyNew1;

public class Leetcode1749 {

	
	
	//short way and kadane's algorithm
	public static int maxAbsoluteSum(int[] nums) {

		int prefixSum = 0, max = 0, min = 0;
		for (int i : nums) {
			prefixSum += i;
			max = Math.max(max, prefixSum);
			min = Math.min(min, prefixSum);
		}
		return max - min;

	}
	
	
	
	    public  static int maxAbsoluteSumNew(int[] nums) {
	        int max_sum = 0, min_sum = 0, max_ending_here = 0, min_ending_here = 0;

	        for (int num : nums) {
	            max_ending_here += num;
	            min_ending_here += num;

	            max_sum = Math.max(max_sum, max_ending_here);
	            min_sum = Math.min(min_sum, min_ending_here);

	            if (max_ending_here < 0) max_ending_here = 0;
	            if (min_ending_here > 0) min_ending_here = 0;
	        }

	        return Math.max(max_sum, Math.abs(min_sum));
	    }
	

	public static void main(String[] args) {

//		Input: nums = [1,-3,2,3,-4]
//				Output: 5
		int[] nums = { 1, -3, 2, 3, -4 };
		System.out.println(maxAbsoluteSum(nums));
		System.out.println("Usinf New"+maxAbsoluteSumNew(nums));
	}

}
