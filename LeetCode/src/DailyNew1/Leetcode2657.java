package DailyNew1;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode2657 {

		    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
	        int n = A.length;
	        int[] result = new int[n];
	        HashSet<Integer> seen = new HashSet<>();
	        int commonCount = 0;

	        for (int i = 0; i < n; i++) {
	            if (!seen.add(A[i])) {
	                commonCount++;
	            }
	            if (!seen.add(B[i])) {
	                commonCount++;
	            }
	            result[i] = commonCount;
	        }

	        return result;
	    }
	
	
	public static void main(String[] args) {
		
		 int[] A = {1, 3, 2, 4};
	        int[] B = {3, 1, 2, 4};
	        
	        int[] result = findThePrefixCommonArray(A, B);
	        System.out.println("Prefix Common Array: " + Arrays.toString(result));
	
	
	
	}
	
}
