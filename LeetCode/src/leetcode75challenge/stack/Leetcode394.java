package leetcode75challenge.stack;

import java.util.Stack;

public class Leetcode394 {

	public static String decodeString(String s) {

		Stack<Integer> st = new Stack<>();
		Stack<StringBuilder> st1 = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = 0;

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c)) {
				n = n * 10 + (c - '0');
			} else if (c == '[') {
				st.push(n);
				n = 0;
				st1.push(sb);
				sb = new StringBuilder();
			} else if (c == ']') {
				int k = st.pop();
				StringBuilder temp = sb;
				sb = st1.pop();
				while (k-- > 0) {
					sb.append(temp);
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {


//Input: s = "3[a]2[bc]"
//Output: "aaabcbc
		
		
		String  s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}

}
