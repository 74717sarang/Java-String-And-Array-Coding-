package DailyNew1;

import java.util.Arrays;

public class Leetcode3264 {

	public static int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            for (int no : nums) {
                min = Math.min(min, no);
            }
	         
            
            int index = -1;
            for (int n=0;n<nums.length;n++) {
                if (nums[n] == min) {
                    index = n;
                    break;
                }
            }
            if (index != -1) {
                nums[index] = nums[index] * multiplier;
            }
        }

        return nums;
    }

	
	
	
	public static void main(String[] args) {

//		Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
//				Output: [8,4,6,5,6]
		
		int[]nums = {2,1,3,5,6};
		int k = 5;
		int multiplier = 2;
		System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
		
		
		
	}

}
