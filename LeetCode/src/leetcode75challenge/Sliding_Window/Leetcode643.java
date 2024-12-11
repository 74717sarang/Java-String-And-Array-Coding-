package leetcode75challenge.Sliding_Window;

public class Leetcode643 {

	
	 public static double findMaxAverage(int[] nums, int k) {

		// all ok but not optimize
		        // double maxAvg = (double)Integer.MIN_VALUE;
		        // if (nums.length == 1)
		        //     return (double) nums[0];

		        // for (int i = 0; i <= nums.length - k; i++) {
		        //     int sum = 0;
		        //     for (int j = i; j < k + i; j++) {
		        //         sum += nums[j];
		        //     }
		        //     double avg = (double) sum / k;
		        //     maxAvg = Math.max(maxAvg, avg);
		        // }
		        // return maxAvg;


		 
		 
		 
		 
		      int sum=0;
		      for(int i=0;i<k;i++){
		        sum+=nums[i];
		      }
		      // IMP setp
		   int maxSum=sum;  // add maxSum
		        for (int i = k; i < nums.length; i++) {
		            sum += nums[i] - nums[i - k]; // Add next element, remove first element of the window
		            maxSum = Math.max(maxSum, sum);
		        }
		      return (double)maxSum/k;
		    }
	
	
	public static void main(String[] args) {

//		Input: nums = [1,12,-5,-6,50,3], k = 4
//		Output: 12.75000
//		Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
	
		int arr[]= {1,12,-5,-6,50,3};int  k = 4;
		System.out.println(findMaxAverage(arr, k));
	}

}
