package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lettercombinationsofaphonenumber {

	public static  List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if (digits.isEmpty())
			return Collections.emptyList();
		String[] phone_map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		backtrack("", digits, phone_map, result);
		return result;
	}

	public static void backtrack(String combination, String digits, String[] phone_map, List<String> output) {

		if (digits.isEmpty()) {
			output.add(combination);
		} else {
			String letters = phone_map[digits.charAt(0) - '2'];
			for (char letter : letters.toCharArray()) {
				backtrack(combination + letter, digits.substring(1), phone_map, output);
			}
		}

	}

	public static void main(String[] args) {

//		Input: digits = "23"
//				Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
		String digits = "23";

		
		System.out.println(letterCombinations(digits).toString());
	}

}
