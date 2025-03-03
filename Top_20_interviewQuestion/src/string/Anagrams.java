package string;

import java.util.HashMap;
import java.util.Map;

//Q12: Check if two strings are k-anagrams or not

public class Anagrams {

	private static boolean brute_force(String str1, String str2, int k) {
		// If lengths are not the same, return false
		if (str1.length() != str2.length()) {
			return false;
		}

		// Create frequency maps for both strings
		int[] freq1 = new int[26]; // For str1
		int[] freq2 = new int[26]; // For str2

		// Fill frequency arrays
		for (int i = 0; i < str1.length(); i++) {
			freq1[str1.charAt(i) - 'a']++;
			freq2[str2.charAt(i) - 'a']++;
		}
		// Calculate the number of differing characters
		int diffCount = 0;
		for (int i = 0; i < 26; i++) {
			diffCount += Math.abs(freq1[i] - freq2[i]);
		}

		// If the number of differing characters is less than or equal to 'k', return
		// true
		return diffCount <= 2 * k;
	}

	private static boolean advance(String str1, String str2, int k) {

		// If lengths are not equal, they cannot be k-anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Create frequency maps for both strings
		Map<Character, Integer> freq1 = new HashMap<>();
		Map<Character, Integer> freq2 = new HashMap<>();

		for (char c : str1.toCharArray()) {
			freq1.put(c, freq1.getOrDefault(c, 0) + 1);
		}

		for (char c : str2.toCharArray()) {
			freq2.put(c, freq2.getOrDefault(c, 0) + 1);
		}

		// Count the number of differing characters
		int diffCount = 0;
		for (Map.Entry<Character, Integer> entry : freq1.entrySet()) {
			char c = entry.getKey();
			int count1 = entry.getValue();
			int count2 = freq2.getOrDefault(c, 0);
			diffCount += Math.abs(count1 - count2);
		}

		// If the total difference is less than or equal to k, it's a k-anagram
		return diffCount <= k;
	}

	public static void main(String[] args) {

		String str1 = "anagram";
		String str2 = "mangara";
		int k = 2;
		System.out.println(brute_force(str1, str2, k));

		System.out.println(advance(str1, str2, k));

	}

}
