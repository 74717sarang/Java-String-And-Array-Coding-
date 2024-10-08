package Daily;

import java.util.Stack;

public class MinimumStringLength {

	
	 public static int minLength(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (char ch : s.toCharArray()) {
	            if (!stack.isEmpty()) {
	                char top = stack.peek();
	                if ((top == 'A' && ch == 'B') || (top == 'C' && ch == 'D')) {
	                    stack.pop();
	                    continue;
	                }
	            }
	            stack.push(ch);
	        }

	        return stack.size();
	    }
	
	
	
	public static void main(String[] args) {
		
		MinimumStringLength obj = new MinimumStringLength();

        // Example 1
        String s1 = "ABFCACDB";
        System.out.println(obj.minLength(s1)); // Output: 2

        // Example 2
        String s2 = "ACBBD";
        System.out.println(obj.minLength(s2)); // Output: 5
	
	
	}
}
