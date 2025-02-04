package DailyNew1;

public class Leetcode1800 {

	public static int maxAscendingSum(int[] nums) {
	      int sum=nums[0];
	      int maxSum=nums[0];
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]<nums[i+1]){
	            sum+=nums[i+1];
	            }
	            else{
	                sum=nums[i+1];
	            }
	            maxSum=Math.max(sum,maxSum);
	        }
	        return maxSum;
	    }
	
	
	
	public static void main(String[] args) {

		// Test Cases
        int[] nums1 = {10, 20, 30, 5, 10, 50};
        System.out.println("Max Ascending Sum: " + Leetcode1800.maxAscendingSum(nums1)); // Expected: 65

		
        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println("Max Ascending Sum: " + Leetcode1800.maxAscendingSum(nums2)); // Expected: 150

        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        System.out.println("Max Ascending Sum: " + Leetcode1800.maxAscendingSum(nums3)); // Expected: 33

        int[] nums4 = {100, 10, 1};
        System.out.println("Max Ascending Sum: " + Leetcode1800.maxAscendingSum(nums4)); // Expected: 100
	}

}
