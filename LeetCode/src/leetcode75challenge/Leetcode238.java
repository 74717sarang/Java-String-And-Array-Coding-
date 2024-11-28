package leetcode75challenge;

public class Leetcode238 {

	    public int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int[] prefix = new int[n];
	        int[] suffix = new int[n];

	        // Step 1: Build prefix product
	        prefix[0] = 1;
	        for (int i = 1; i < n; i++) {
	            prefix[i] = prefix[i - 1] * nums[i - 1];
	        }

	        // Step 2: Build suffix product
	        suffix[n - 1] = 1;
	        for (int i = n - 2; i >= 0; i--) {
	            suffix[i] = suffix[i + 1] * nums[i + 1];
	        }

	        // Step 3: Combine prefix and suffix products
	        for (int i = 0; i < n; i++) {
	            result[i] = prefix[i] * suffix[i];
	        }

	        return result;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
