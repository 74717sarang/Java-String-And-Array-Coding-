package leetcode75challenge;

public class Leetcode334 {
	
	    public static  boolean increasingTriplet(int[] nums) {
	        // not for all 68/84
	        
	    	// for(int i=0;i<nums.length-2;i++){
	        // if((nums[i]< nums[i+1])){
	        // if(nums[i+1] < nums[i+2]){
	        // return true;
	        // }
	        // }
	        // }

	        int minElement1 = Integer.MAX_VALUE;
	        int minElement2 = Integer.MAX_VALUE;

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] <= minElement1)
	                minElement1 = nums[i];
	            else if (nums[i] <= minElement2)
	                minElement2 = nums[i];
	            else {
	                return true;
	            }

	        }

	        return false;
	    }
	    
	    public static void main(String[] args) {
//	    	Input: nums = [1,2,3,4,5]
//	    	Output: true
//	    	Explanation: Any triplet where i < j < k is valid.
		
	    	int[]nums = {1,2,3,4,5};
	    	System.out.println(increasingTriplet(nums));
	    
	    
	    }
	
}
