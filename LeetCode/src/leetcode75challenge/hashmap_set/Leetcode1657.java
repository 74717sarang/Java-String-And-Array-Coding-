package leetcode75challenge.hashmap_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1657 {

//	    public static boolean closeStrings(String word1, String word2) {
//	        if (word1.length() != word2.length()) return false;
//	        
//	        int[] freq1 = new int[26], freq2 = new int[26];
//	        for (char c : word1.toCharArray()) freq1[c - 'a']++;
//	        for (char c : word2.toCharArray()) freq2[c - 'a']++;
//	        
//	        for (int i = 0; i < 26; i++) {
//	            if ((freq1[i] > 0) != (freq2[i] > 0)) return false;
//	        }
//	        
//	        Arrays.sort(freq1);
//	        Arrays.sort(freq2);
//	        
//	        return Arrays.equals(freq1, freq2);
//	    }

	// with map
	public static boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length())
			return false;

		// Store frequency of characters using HashMap
		Map<Character, Integer> freq1 = new HashMap<>();
		Map<Character, Integer> freq2 = new HashMap<>();

		for (char c : word1.toCharArray())
			freq1.put(c, freq1.getOrDefault(c, 0) + 1);
		for (char c : word2.toCharArray())
			freq2.put(c, freq2.getOrDefault(c, 0) + 1);

		// Check if both words contain the same unique characters
		if (!freq1.keySet().equals(freq2.keySet()))
			return false;

		// Compare frequency counts
		List<Integer> values1 = new ArrayList<>(freq1.values());
		List<Integer> values2 = new ArrayList<>(freq2.values());

		Collections.sort(values1);
		Collections.sort(values2);

		return values1.equals(values2);
	}

	public static void main(String[] args) {
		System.out.println(closeStrings("abc", "bca")); // true
		System.out.println(closeStrings("a", "aa")); // false
		System.out.println(closeStrings("cabbba", "abbccc")); // true
	}

}
