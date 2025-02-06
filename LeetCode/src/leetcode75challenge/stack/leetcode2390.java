package leetcode75challenge.stack;

import java.util.Stack;

public class leetcode2390 {

//	2390. Removing Stars From a String + leftchatr also remove

	public static String removeStars(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder str = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == '*') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(c);
			}

		}
		while (!stack.isEmpty()) {
			str.append(stack.pop());
		}

		return str.reverse().toString();
	}

	public static String removeStarsNew(String s) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				str.deleteCharAt(str.length() - 1);
			} else {
				str.append(s.charAt(i));
			}
		}

		return str.toString();
	}

	public static void main(String[] args) {

//		Input: s = "leet**cod*e"
//				Output: "lecoe"
		String s = "leet**cod*e";

		System.out.println(removeStars(s));
		System.out.println(removeStarsNew(s));
	}

}
