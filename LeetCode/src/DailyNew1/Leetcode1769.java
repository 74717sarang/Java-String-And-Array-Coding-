package DailyNew1;

import java.util.Arrays;

public class Leetcode1769 {

	
	    public static int[] minOperations(String boxes) {
	        int n = boxes.length();
	        int[] result = new int[n];
	        int count = 0, steps = 0;

	        // Traverse from left to right
	        for (int i = 0; i < n; i++) {
	            result[i] = steps;
	            count += boxes.charAt(i) == '1' ? 1 : 0;
	            steps += count;
	        }

	        count = 0;
	        steps = 0;

	        // Traverse from right to left
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] += steps;
	            count += boxes.charAt(i) == '1' ? 1 : 0;
	            steps += count;
	        }

	        return result;
	    }
	
	
	public static void main(String[] args) {

//		Input: boxes = "110"
//				Output: [1,1,3]
		
		String boxes = "110";
		
		System.out.println(Arrays.toString(minOperations(boxes)));
	}

}
