package Daily;

import java.util.Arrays;

public class PermutationString {

	private boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return false;
		}
//for only small alphabate 
		int[] s1Count = new int[26];
		int[] s2Count = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			s1Count[s1.charAt(i) - 'a']++;
			s2Count[s2.charAt(i) - 'a']++;
		}
		for (int i = s1.length(); i < s2.length(); i++) {

			if (Arrays.equals(s1Count, s2Count)) {
				return true;
			}
			s2Count[s2.charAt(i) - 'a']++;
			s2Count[s2.charAt(i - s1.length()) - 'a']--;
		}
		return Arrays.equals(s1Count, s2Count);
	}

	public static void main(String[] args) {

		PermutationString solution = new PermutationString();

		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(solution.checkInclusion(s1, s2)); // Output: true

		s1 = "ab";
		s2 = "eidboaoo";
		System.out.println(solution.checkInclusion(s1, s2)); // Output: false
	}

}
