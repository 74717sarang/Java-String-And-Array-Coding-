package com.array;

import java.util.HashSet;
import java.util.Set;

public class Leetcode2154 {

	 public static int findFinalValue(int[] nums, int original) {
	        Set<Integer> set = new HashSet<>();
	        for (int i : nums) {
	            set.add(i);
	        }
	        for (int i : nums) {
	            if (set.contains(original)) {
	                original = original * 2;
	            }
	        }
	        return original;
	    }
	 
	 public static void main(String[] args) {
//		 Input: nums = [5,3,6,1,12], original = 3
//		 Output: 24
//				 Explanation: 
//				 - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
//				 - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
//				 - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
//				 - 24 is not found in nums. Thus, 24 is returned.
	
	 
		 int[]nums = {5,3,6,1,12};
		 int original = 3;
		 System.out.println(findFinalValue(nums, original));
		 
	 
	 }
	
	
}
