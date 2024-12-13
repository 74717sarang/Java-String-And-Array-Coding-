package com.array;

public class SlidingWindow {

	private static int maxWindowSum(int[] arr, int window) {
		int currentSum = 0;
		for (int i = 0; i < window; i++) {
			currentSum += arr[i];
		}
		int maxx = currentSum;
		for (int i = 1; i <= arr.length - window; i++) {
			currentSum = currentSum + arr[window - 1 + i] - arr[i - 1];
			if (currentSum > maxx) {
				maxx = currentSum;
			}
		}

		return maxx;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 8, 2, 5, 7, 6, 12 };
		int window = 4;
		
		//using slidind window comple:O(n)
		System.out.println(maxWindowSum(arr, window));

		//using slidind window comple:O(n)
				System.out.println("from new para"+maxWindowSumPara(arr, window));
		
				// Normal time comple:n^2 
		int max = 0;
		for (int i = 0; i <= arr.length - window; i++) {
			int sum = 0;

			for (int j = i; j < i + window; j++) {
				sum += arr[j];
			}
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("max::" + max);
	}

	private static int  maxWindowSumPara(int[] nums, int window) {

		int maxSum=0;
		int sum=0;
		for(int i=0;i<window;i++) {
			sum+=nums[i];
		}
		maxSum=sum;
		for(int i=window;i<nums.length;i++) {
//			sum=sum-nums[i-window]+nums[i];// both are same
			sum+=nums[i]-nums[i-window];   // same 

			maxSum=Math.max(maxSum, sum); 
		}
		
		return maxSum;
	}

}
