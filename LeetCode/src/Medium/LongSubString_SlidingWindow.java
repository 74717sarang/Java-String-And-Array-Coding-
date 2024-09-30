package Medium;

import java.util.HashMap;
import java.util.Map;

public class LongSubString_SlidingWindow {

//	        Input: s = "abcabcbb"
//			Output: 3
//			Explanation: The answer is "abc", with the length of 3.
	
//         	Input: s = "bbbbb"
//			Output: 1
//			Explanation: The answer is "b", with the length of 1. 
	

	public static int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int maxlength = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (map.containsKey(currentChar)) {
				start = Math.max(start, map.get(currentChar) + 1);
			}
			map.put(currentChar, i);
			maxlength = Math.max(i - start + 1, maxlength);
		}
		return maxlength;
	}

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}

}
