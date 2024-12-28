package DailyNew1;

import java.util.Arrays;

public class Leetcode689 {

	
	    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {
	        int n = nums.length;
	        int[] sum = new int[n + 1];
	        for (int i = 0; i < n; i++) {
	            sum[i + 1] = sum[i] + nums[i];
	        }
	        
	        int[] left = new int[n];
	        int[] right = new int[n];
	        int[] result = new int[3];
	        
	        // Left max sum index
	        int maxSum = sum[k] - sum[0];
	        left[k - 1] = 0;
	        for (int i = k; i < n; i++) {
	            if (sum[i + 1] - sum[i + 1 - k] > maxSum) {
	                maxSum = sum[i + 1] - sum[i + 1 - k];
	                left[i] = i + 1 - k;
	            } else {
	                left[i] = left[i - 1];
	            }
	        }
	        
	        // Right max sum index
	        maxSum = sum[n] - sum[n - k];
	        right[n - k] = n - k;
	        for (int i = n - k - 1; i >= 0; i--) {
	            if (sum[i + k] - sum[i] >= maxSum) {
	                maxSum = sum[i + k] - sum[i];
	                right[i] = i;
	            } else {
	                right[i] = right[i + 1];
	            }
	        }
	        
	        // Find the result
	        maxSum = 0;
	        for (int i = k; i <= n - 2 * k; i++) {
	            int l = left[i - 1];
	            int r = right[i + k];
	            int total = (sum[i + k] - sum[i]) + (sum[l + k] - sum[l]) + (sum[r + k] - sum[r]);
	            if (total > maxSum) {
	                maxSum = total;
	                result[0] = l;
	                result[1] = i;
	                result[2] = r;
	            }
	        }
	        
	        return result;
	    }
	
	
	
	public static void main(String[] args) {

		int [] nums = {1,2,1,2,6,7,5,1};
		int k = 2;
		
		int [] result=maxSumOfThreeSubarrays(nums, k);
		System.out.println(Arrays.toString(result));
		
		
	}

}
