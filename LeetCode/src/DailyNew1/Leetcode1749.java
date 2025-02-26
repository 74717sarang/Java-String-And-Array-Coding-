package DailyNew1;

public class Leetcode1749 {

	
	    public static  int maxAbsoluteSum(int[] nums) {

	    int prefixSum=0,max=0,min=0;
	    
	     for(int i:nums){
	       prefixSum+=i;
	       max=Math.max(max,prefixSum);
	       min=Math.min(min,prefixSum); 
	     }
	     return max-min;

	    }

	public static void main(String[] args) {

//		Input: nums = [1,-3,2,3,-4]
//				Output: 5
	int[]nums = {1,-3,2,3,-4};
	System.out.println(maxAbsoluteSum(nums));
	}

}
