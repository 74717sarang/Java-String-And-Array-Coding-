package DailyNew1;

import java.util.Arrays;

public class Leetcode2593 {

public long findScore(int[] nums) {
        
        // this logic work almost 788/1044 test case
        
         long sum = 0;
         int mark = 0;
         int len = nums.length;

         while (mark < nums.length) {
             // Find the minimum value
             int min = Arrays.stream(nums).min().orElseThrow();

             // Find the index of the minimum value
             int index = -1;
             for (int i = 0; i < nums.length; i++) {
                 if (nums[i] == min) {
                     index = i;
                     break;
                 }
             }

             // Mark adjacent elements as MAX_VALUE
             if (index + 1 < len) {
                 nums[index + 1] = Integer.MAX_VALUE;
                 mark++;
             }
             if (index - 1 >= 0) {
                 nums[index - 1] = Integer.MAX_VALUE;
                 mark++;
             }

             // Add the minimum value to the sum
             sum += min;

//              Mark the current element as MAX_VALUE
             nums[index] = Integer.MAX_VALUE;
             mark++;
         }
         return sum;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
