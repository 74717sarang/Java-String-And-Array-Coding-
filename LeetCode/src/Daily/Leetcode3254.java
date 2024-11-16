package Daily;

import java.util.Arrays;

public class Leetcode3254 {

	
	    public static int[] resultsArray(int[] nums, int k) {

	   int n = nums.length;
	        int[] result = new int[n - k + 1];
	        int[] f = new int[n];
	        Arrays.fill(f, 1);

	        // Compute lengths of consecutive increasing subsequences
	        for (int i = 1; i < n; i++) {
	            if (nums[i] == nums[i - 1] + 1) {
	                f[i] = f[i - 1] + 1;
	            }
	        }

	        // Determine the "power" of each k-size subarray
	        for (int i = k - 1; i < n; i++) {
	            if (f[i] >= k) {
	                result[i - k + 1] = nums[i];
	            } else {
	                result[i - k + 1] = -1;
	            }
	        }
	        return result;
	    }
	
	
	
	public static void main(String[] args) {

		
//		Leetcode3254 obj = new Leetcode3254();
	        int[] nums = {1, 2, 3, 4, 3, 2, 5};
	        int k = 3;
	        System.out.println(Arrays.toString(resultsArray(nums, k)));
	    
	}

}
