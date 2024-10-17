package co.string;

import java.util.HashMap;
import java.util.Map;

public class CountOfChar {

	public static void main(String[] args) {

		String str = "Wwel wel wel";

		// this most efficient way for large input     O(n)
		
		System.out.println("With Map Using ");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (map.containsKey(ch)) {
				int co = map.get(ch);
				map.put(ch, ++co);
			} else {
				map.put(ch, 1);
			}
		}
		map.forEach((k, v) -> System.out.println("Character: " + k + ", Count: " + v));

		
		
		//using normal for loop     O(n^2)
		
		
		int[] count = new int[str.length()];
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count[i]++;
					arr[j] = '0';
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] != '0' && arr[k] != ' ') {
				System.out.println(arr[k] + " " + count[k]);
			}
		}

//        int[] freq = new int[str.length()];
//        char[] chars = str.toCharArray();
//
//        for (int i = 0; i < str.length(); i++) {
//            freq[i] = 1;  // Initialize frequency of each character as 1
//            for (int j = i + 1; j < str.length(); j++) {
//                if (chars[i] == chars[j]) {
//                    freq[i]++;
//                    chars[j] = '0';  // Mark as counted
//                }
//            }
//        }
//
//        System.out.println("Character frequencies:");
//        for (int i = 0; i < freq.length; i++) {
//            if (chars[i] != '0') {  // Print only if the character is not marked
//            	System.out.println(chars[i] + " : " + freq[i]); 
//            }
//        }

	}

}
