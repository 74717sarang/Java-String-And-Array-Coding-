package Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	// leetcode 46

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		backtrackImpl(nums, new ArrayList<>(), result);
		return result;
	}

	public void backtrackImpl(int[] nums, List<Integer> tempList, List<List<Integer>> result) {

		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
			return;
		}

		for (int num : nums) {
			if (tempList.contains(num))
				continue; // Skip already used numbers
			tempList.add(num); // Choose
			backtrackImpl(nums, tempList, result); // Explore
			tempList.remove(tempList.size() - 1); // Unchoose
		}
	}

	public static void main(String[] args) {

		Permutations obj = new Permutations();
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = obj.permute(nums);
		System.out.println("Permutations of [1, 2, 3]:");
		for (List<Integer> permutation : result) {
			System.out.println(permutation);
		}
	}
}
