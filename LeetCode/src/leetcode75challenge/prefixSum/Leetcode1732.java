package leetcode75challenge.prefixSum;

public class Leetcode1732 {

	 public static int largestAltitude(int[] gain) {
	        int maxAltitude = 0;
	        int current = 0;

	        for (int i : gain) {
	            current += i;
	            maxAltitude = Math.max(maxAltitude, current);

	        }

	        return maxAltitude;
	    }
	
	public static void main(String[] args) {
//		Input: gain = [-5,1,5,0,-7]
//				Output: 1
//				Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
	
	int[]gain = {-5,1,5,0,-7};
	System.out.println(largestAltitude(gain));
	}
}
