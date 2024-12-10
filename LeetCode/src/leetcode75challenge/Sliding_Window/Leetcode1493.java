package leetcode75challenge.Sliding_Window;

public class Leetcode1493 {

	
    public static int longestSubarray(int[] nums) {
        int count=0;
        int maxsize=0;
        int left=0;
        int zerocount=0;

        for(int right=0;right<nums.length;right++){
          if(nums[right]==0){
            ++zerocount;   
          }
          while(zerocount > 1){
            if(nums[left]==0){
                --zerocount;
            }
            left++;
          }
       
         maxsize=Math.max(maxsize,right-left);
        }
        return maxsize;
    }
	
	public static void main(String[] args) {
		
//		Input: nums = [1,1,0,1]
//				Output: 3
		
		
		int []nums = {1,1,0,1};
  System.out.println(longestSubarray(nums));
	}
}
