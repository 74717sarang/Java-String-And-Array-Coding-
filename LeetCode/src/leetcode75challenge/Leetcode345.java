package leetcode75challenge;

import java.util.HashSet;
import java.util.Set;

public class Leetcode345 {

	// using two pointer with while loop and set for time limit exceed
	public String reverseVowels(String s) {
		char[] chArr = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		// String vovels="aeiouAEIOU";
		// without hashset it comes TLE time limit
		Set<Character> set = new HashSet<>();
		for (char c : "aeiouAEIOU".toCharArray()) {
			set.add(c);
		}

		while (left < right) {
                 
			while (left < right && !set.contains(chArr[left])) {
				left++;
			}

			while (left < right && !set.contains(chArr[right])) {
				right--;
			}

			if (left < right) {
				char temp = chArr[left];
				chArr[left] = chArr[right];
				chArr[right] = temp;
				left++;
				right--;
			}

		}
		return new String(chArr);
	}

	public static void main(String[] args) {

//		      Input: s = "IceCreAm"
//
//				Output: "AceCreIm"
//
//				Explanation:
//
//				The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm"

		Leetcode345 obj = new Leetcode345();

		// Test cases
		String test1 = "hello";
		String test2 = "leetcode";
		String test3 = "aA";

		// Outputs
		System.out.println(obj.reverseVowels(test1)); // Output: "holle"
		System.out.println(obj.reverseVowels(test2)); // Output: "leotcede"
		System.out.println(obj.reverseVowels(test3)); // Output: "Aa"

	}

}
