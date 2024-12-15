package com.test1;

import java.util.HashMap;
import java.util.Map;

public class MaxCount {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 1, 1, 1, 5, 2,3 };
		System.out.println("Majority Element: " + findMajorityElement(nums));
	}

	private static int findMajorityElement(int[] nums) {
		int ele=0;

		Map<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(int i:map.keySet()) {
			if(map.get(i)>nums.length/2) {
				System.out.println(i);
			}
		}
		
		
//		System.out.println(map.get(2));
		
		return ele;
	}
}
