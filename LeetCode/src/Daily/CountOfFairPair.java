package Daily;

import java.util.Arrays;

public class CountOfFairPair {

	    public long countFairPairs(int[] nums, int lower, int upper) {
	        // Sort the array for easier range search
	        Arrays.sort(nums);
	        long count = 0;

	        for (int i = 0; i < nums.length - 1; i++) {
	            int lowIndex = findLowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
	            int highIndex = findUpperBound(nums, i + 1, nums.length - 1, upper - nums[i]);

	            // Add the count of valid pairs for the current element nums[i]
	            count += highIndex - lowIndex + 1;
	        }

	        return count;
	    }

	    private int findLowerBound(int[] nums, int left, int right, int target) {
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] >= target) right = mid - 1;
	            else left = mid + 1;
	        }
	        return left;
	    }

	    private int findUpperBound(int[] nums, int left, int right, int target) {
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] <= target) left = mid + 1;
	            else right = mid - 1;
	        }
	        return right;
	    }
	
	
	
	public static void main(String[] args) {

		CountOfFairPair obj = new CountOfFairPair();

	        // Test case 1
	        int[] nums1 = {1, 2, 3, 4, 5};
	        int lower1 = 4;
	        int upper1 = 7;
	        long result1 = obj.countFairPairs(nums1, lower1, upper1);
	        System.out.println("Number of fair pairs (Test case 1): " + result1);  // Expected output depends on input

	        // Test case 2
	        int[] nums2 = {0, -1, 3, -2, 2};
	        int lower2 = 1;
	        int upper2 = 3;
	        long result2 = obj.countFairPairs(nums2, lower2, upper2);
	        System.out.println("Number of fair pairs (Test case 2): " + result2);  // Expected output depends on input

	        // Test case 3
	        int[] nums3 = {2, 4, 6, 8};
	        int lower3 = 5;
	        int upper3 = 10;
	        long result3 = obj.countFairPairs(nums3, lower3, upper3);
	        System.out.println("Number of fair pairs (Test case 3): " + result3);  // Expected output depends on input
		
		
		
	}

}
