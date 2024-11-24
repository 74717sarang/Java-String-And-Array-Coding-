package DailyNew1;

public class Leetcode1975 {

	
	 public static long maxMatrixSum(int[][] matrix) {
	        int n = matrix.length;
	        long sum = 0; // To store the total absolute value sum
	        int minAbsValue = Integer.MAX_VALUE; // Minimum absolute value in the matrix
	        int negativeCount = 0; // Count of negative numbers
	        
	        // Traverse the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                int value = matrix[i][j];
	                sum += Math.abs(value); // Add the absolute value to the sum
	                if (value < 0) {
	                    negativeCount++; // Increment negative count if the value is negative
	                }
	                minAbsValue = Math.min(minAbsValue, Math.abs(value)); // Update the minimum absolute value
	            }
	        }
	        
	        // If the count of negatives is even, no adjustment needed
	        if (negativeCount % 2 == 0) {
	            return sum;
	        } else {
	            // If the count of negatives is odd, subtract twice the smallest absolute value
	            return sum - 2 * minAbsValue;
	        }
	    }
	
	
	public static void main(String[] args) {

		int[][] matrix = {
	            {1, -1, 3},
	            {-2, 2, -3},
	            {4, 5, -6}
	        };
	        System.out.println("Maximum Matrix Sum: " + maxMatrixSum(matrix));
	}

}
