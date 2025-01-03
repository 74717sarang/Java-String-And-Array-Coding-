package DailyNew1;

import Daily.minChanges;

public class Leetcode2270 {

	
	    public static int waysToSplitArray(int[] nums) {
	        int n = nums.length;
	        long totalSum = 0;
	        for (int num : nums) {
	            totalSum += num;
	        }
	        
	        long leftSum = 0;
	        int ways = 0;
	        for (int i = 0; i < n - 1; i++) {
	            leftSum += nums[i];
	            if (leftSum >= totalSum - leftSum) {
	                ways++;
	            }
	        }
	        
	        return ways;
	    }

	public static void main(String[] args) {
		
		
//		Input: nums = [10,4,-8,7]
//				Output: 2
	
	int[]nums = {10,4,-8,7};
	System.out.println(waysToSplitArray(nums));
	
	}
}
