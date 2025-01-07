package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1408 {

	public static List<String> stringMatching(String[] words) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i != j && words[j].contains(words[i])) {
					result.add(words[i]);
					break;
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {

//		Input: words = ["mass","as","hero","superhero"]
//				Output: ["as","hero"]

		String[] words = { "mass", "as", "hero", "superhero" };

		System.out.println(stringMatching(words).toString());
	}

}
