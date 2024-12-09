package leetcode75challenge;

public class Leetcode1004 {

	// more sutable
	public static int longestOnesNew(int[] nums, int k) {
		
		int max=0;
		int start=0;
		int zeroCount=0;
		
		for(int end=0;end<nums.length;end++) {
			if(nums[end]==0) {
				zeroCount++;
			}
			while(zeroCount > k) {
				if(nums[start]==0) {
					zeroCount--;
				}
				start++;
			}
			
			max=Math.max(max,end-start+1);
		}
		
		
		return max;
		
	}

	
	
	
	
	
	// refer above
	public int longestOnes(int[] nums, int k) {

		int max = 0;
		int left = 0;
		int right = 0;
		
		for (right = 0; right < nums.length; right++) {

			if (nums[right] == 0) {
				k--;
			}
			while (k < 0) {
				if (nums[left] == 0) {
					k++;
				}
				left++;
			}

			max = Math.max(max, right - left + 1);
		}

		return max;
	}

	public static void main(String[] args) {

		int[]nums = {1,1,1,0,0,0,1,1,1,1,0}; 
		int k = 2;
		System.out.println(longestOnesNew(nums, k)); //6
		
		
		
	}

}
