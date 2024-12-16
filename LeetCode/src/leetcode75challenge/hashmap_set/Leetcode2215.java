package leetcode75challenge.hashmap_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode2215 {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}
		for (int i : nums2) {
			set2.add(i);
		}

		for (int i : set1) {
			if (!set2.contains(i)) {
				list1.add(i);
			}
		}
		for (int i : set2) {
			if (!set1.contains(i)) {
				list2.add(i);
			}
		}
		result.add(list1);
		result.add(list2);

		// Set<Integer> set1 = new HashSet<>();
		// Set<Integer> set2 = new HashSet<>();
		// for (int num : nums1) {
		// set1.add(num);
		// }
		// for (int num : nums2) {
		// set2.add(num);
		// }
		// List<Integer> uniqueToNums1 = new ArrayList<>();
		// List<Integer> uniqueToNums2 = new ArrayList<>();
		// for (int num : set1) {
		// if (!set2.contains(num)) {
		// uniqueToNums1.add(num);
		// }
		// }
		// for (int num : set2) {
		// if (!set1.contains(num)) {
		// uniqueToNums2.add(num);
		// }
		// }
		// result.add(uniqueToNums1);
		// result.add(uniqueToNums2);

		return result;
	}

	public static void main(String[] args) {

		//Output:
//		answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//		answer[1] is a list of all distinct integers in nums2 which are not present in nums1
		
		
		Leetcode2215 obj = new Leetcode2215();
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };
		List<List<Integer>> result = obj.findDifference(nums1, nums2);
		System.out.println(result);

	}

}
