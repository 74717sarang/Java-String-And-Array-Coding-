package DailyNew1;

public class Leetcode2342 {
 
	    public static  int maximumSum(int[] nums) {
	        int map[] = new int[82], res = -1;
	        for (int i = 0; i < nums.length; i++){
	            int sum = 0, num = nums[i];
	            while (num > 0){
	                sum += (num % 10);
	                num /= 10;
	            }
	            if (map[sum] != 0){
	                res = Math.max(res, nums[i] + map[sum]);
	                map[sum] = Math.max(map[sum], nums[i]);
	            }
	            else map[sum] = nums[i];
	        }
	        return res;
	    }
	
	
	
	public static void main(String[] args) {

//		 Max Sum of a Pair With Equal Sum of Digits
//		Input: nums = [18,43,36,13,7]
//				Output: 54
//		Explanation: The pairs (i, j) that satisfy the conditions are:
//			- (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
//			- (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
//			So the maximum sum that we can obtain is 54.
		
		
		int[]nums = {18,43,36,13,7};
		
		System.out.println(maximumSum(nums));
	}



}
