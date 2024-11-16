package Medium;

import java.util.Stack;

public class leetcode1249 {

	
	 public  static String minRemoveToMakeValid(String s) {
	        StringBuilder sb = new StringBuilder(s);
	        Stack<Integer> stack = new Stack<>();

	        // Step 1: Identify invalid parentheses
	        for (int i = 0; i < sb.length(); i++) {
	            char c = sb.charAt(i);
	            if (c == '(') {
	                stack.push(i);
	            } else if (c == ')') {
	                if (stack.isEmpty()) {
	                    sb.setCharAt(i, '*'); // Mark invalid closing parenthesis
	                } else {
	                    stack.pop(); // Valid pair
	                }
	            }
	        }

	        // Step 2: Mark remaining unmatched opening parentheses
	        while (!stack.isEmpty()) {
	            sb.setCharAt(stack.pop(), '*');
	        }

	        // Step 3: Build the result string, skipping marked characters
	        return sb.toString().replaceAll("\\*", "");
	    }
	
	
	public static void main(String[] args) {

		 String s = "lee(t(c)o)de)";
	        System.out.println(minRemoveToMakeValid(s)); // Output: "lee(t(c)o)de"
	}

}
