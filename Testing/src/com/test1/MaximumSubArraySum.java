package com.test1;

import java.util.Arrays;

public class MaximumSubArraySum {

	
	public static void main(String[] args) {
		
		int []arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Max Sum::"+MaximumSubArraySumMethode(arr));
	}

	private static int MaximumSubArraySumMethode(int[] arr) {

		int max=0;
		Arrays.sort(arr);
		if(arr.length<2) return 0;
		max=arr[arr.length-1]+arr[arr.length-2];
		
		int maxSum=arr[0];
		int currentSum=arr[0];
		for(int i=0;i<arr.length;i++) {
			currentSum =Math.max(arr[i], currentSum+arr[i]);
			maxSum=Math.max(maxSum, currentSum);
		}
		
		return max;
	} 
	
}
