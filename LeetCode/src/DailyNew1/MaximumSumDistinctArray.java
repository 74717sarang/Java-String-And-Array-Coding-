package DailyNew1;

import java.awt.desktop.OpenURIHandler;
import java.util.HashSet;
import java.util.Set;

public class MaximumSumDistinctArray {

	// not work for all
	public long maximumSubarraySum(int[] nums, int k) {
		long max = 0;
		for (int i = 0; i <= nums.length - k; i++) { // Adjust the loop to include the last valid subarray
			int sum = 0;
			Set<Integer> set = new HashSet<>();
			boolean isDistinct = true;
			// Check the subarray of size k
			for (int j = i; j < i + k; j++) {
				sum += nums[j];
				// If we find a duplicate, the subarray is invalid
				if (!set.add(nums[j])) {
					isDistinct = false;
					break;
				}
			}

			// Only update max if the subarray is distinct
			if (isDistinct) {
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	
	
	// more efficient with set and Slidind window
	public long maximumSubarraySumNew(int[] nums, int k) {
		long max = 0;
		long sum = 0;
		Set<Integer> set = new HashSet<>();
		int left = 0;

		for (int right = 0; right < nums.length ; right++) {
			sum += nums[right];

			while (set.contains(right)) {
				set.remove(nums[left]);
				sum -= nums[left];
				left++;
			}
			set.add(right);
			if (right - left + 1 == k) {
				max = Math.max(max, sum);
				set.remove(nums[left]);
				sum -= nums[left];
				left++;
			}

		}

		return max;

	}

	public static void main(String[] args) {

		  // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        int k1 = 3;
        MaximumSumDistinctArray obj = new MaximumSumDistinctArray();
        System.out.println("Maximum Subarray Sum (Test 1): " + obj.maximumSubarraySum(nums1, k1));
        // Expected Output: 12 (subarray [3, 4, 5])

        // Test case 2
        int[] nums2 = {4, 4, 4, 4};
        int k2 = 2;
        System.out.println("Maximum Subarray Sum (Test 2): " + obj.maximumSubarraySum(nums2, k2));
        // Expected Output: 0 (no distinct subarrays of size 2)

        // Test case 3
        int[] nums3 = {1, 2, 1, 3, 2, 4};
        int k3 = 3;
        System.out.println("Maximum Subarray Sum (Test 3): " + obj.maximumSubarraySum(nums3, k3));
        // Expected Output: 9 (subarray [3, 2, 4])

        // Test case 4
        int[] nums4 = {7, 3, 5, 1, 6, 3, 7, 8};
        int k4 = 4;
        System.out.println("Maximum Subarray Sum (Test 4): " + obj.maximumSubarraySum(nums4, k4));
        // Expected Output: 24 (subarray [6, 3, 7, 8])
	}

}
