package leetcode75challenge.array_string;

import java.util.Arrays;

public class MaxNoOfK_Sum {

	
	// with two pointer approch
	private static int maxOperations(int[] nums, int k) {
		int operation = 0;
		int left = 0;
		int right = nums.length-1;
         
		Arrays.sort(nums);  // for run all test case
		while (left < right) {
			int sum = 0;
			sum = nums[left] + nums[right];
			if (sum == k) {
				operation++;
				left++;
				right--;

			} else if (sum < k) {
				left++;
			} else {
				right--;
			}
		}
		return operation;
	}
	
	// with using map => hashmap is more efficient
	// int rem=K-nums[i] O(n) using map
	
	
	

	public static void main(String[] args) {

		// Test case 1
		int[] nums1 = { 1, 2, 3, 4 };
		int k1 = 5;
		System.out.println("Max operations: " + maxOperations(nums1, k1)); // Output: 2

		// Test case 2
		int[] nums2 = { 3, 1, 3, 4, 3 };
		int k2 = 6;
		System.out.println("Max operations: " + maxOperations(nums2, k2)); // Output: 1

		// Test case 3
		int[] nums3 = { 2, 5, 4, 1, 6, 3 };
		int k3 = 7;
		System.out.println("Max operations: " + maxOperations(nums3, k3)); // Output: 3
	}

}
