package DailyNew1;

import java.util.HashSet;
import java.util.Set;

public class Leetcode873 {

	
	    public static int lenLongestFibSubseq(int[] arr) {
	        int n = arr.length;
	        // Store array elements in set for O(1) lookup
	        Set<Integer> numSet = new HashSet<>();
	        for (int num : arr) {
	            numSet.add(num);
	        }

	        int maxLen = 0;
	        // Try all possible first two numbers of sequence
	        for (int start = 0; start < n; ++start) {
	            for (int next = start + 1; next < n; ++next) {
	                // Start with first two numbers
	                int prev = arr[next];
	                int curr = arr[start] + arr[next];
	                int len = 2;

	                // Keep finding next Fibonacci number
	                while (numSet.contains(curr)) {
	                    // Update values for next iteration
	                    int temp = curr;
	                    curr += prev;
	                    prev = temp;
	                    maxLen = Math.max(maxLen, ++len);
	                }
	            }
	        }

	        return maxLen;
	    }

	
	
	
	public static void main(String[] args) {

//		Input: arr = [1,2,3,4,5,6,7,8]
//				Output: 5
//				Explanation: The longest subsequence that is fibonacci-like: [1,2,3,5,8].
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(lenLongestFibSubseq(arr)); 
		
	}

}
