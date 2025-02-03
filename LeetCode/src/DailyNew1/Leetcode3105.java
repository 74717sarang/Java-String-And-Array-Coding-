package DailyNew1;

public class Leetcode3105 {

	    public static int longestMonotonicSubarray(int[] nums) {
	       int incount =1;
	        int deccount=1;
	         int maxcount=1;
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]<nums[i+1]){
	                 deccount=1;
	                 incount++;
	            }
	            else if(nums[i]>nums[i+1]){
	                deccount++;
	                incount=1;
	            }
	            else{
	                deccount=1;
	                incount=1;
	            }
	             maxcount=Math.max(maxcount,Math.max(incount,deccount));

	        }



	    return maxcount; 
	    }

	public static void main(String[] args) {
//		 Longest Strictly Increasing or Strictly Decreasing Subarray
		
		
		int[]nums = {1,4,3,3,2};
//		o/p=2;
		System.out.println(longestMonotonicSubarray(nums));
		
	}

}
