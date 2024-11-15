package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


	// map Collection
	private static int[] twoSumMap(int[] nums, int target) {

	Map<Integer, Integer>map=new HashMap<>();
	  for(int i=0;i<nums.length;i++) {
		  int rem=target-nums[i];
		  if(map.containsKey(rem)) {
			  return new int[] {map.get(rem),i};
		  }
		  map.put(nums[i],i);
	  }
		return new int[] { 0, 0 };

	}
	private static int[] twoSum(int[] nums, int target) {

		
		
		
		// two poiner way
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };

				}
			}
		}

		return new int[] { 0, 0 };
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum(nums, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);
 
		System.out.println("With Map");
		// other way with map because of we need a index
//		int target1 = 26;
		int[] result1 = twoSumMap(nums, target);
		System.out.println("Indices: " + result1[0] + ", " + result1[1]);
		
	
	   
	}

}
