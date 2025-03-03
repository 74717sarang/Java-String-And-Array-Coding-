package string;

import java.util.HashMap;
import java.util.Map;

//Q11: Print duplicate characters from a string?
public class FindDuplicate {

	private static void brute_force(String str) {

		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] > 1) {
				System.out.printf("%c", 97 + i);
				System.out.println(" " + arr[i] + " times repeated ");
			}
		}

	}

	private static void advance(String str) {

		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
        
		for(Map.Entry<Character, Integer>i:map.entrySet()) {
			if(i.getValue()>1) {
				System.out.println(i.getKey()+" repeated "+i.getValue()+" times");
			}
		}
	}

	public static void main(String[] args) {

		String str = "abcazzzzz";
		brute_force(str);
		System.out.println();
		advance(str);
	}

}
