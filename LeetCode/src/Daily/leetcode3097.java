package Daily;

public class leetcode3097 {

	    public int minimumSubarrayLength(int[] nums, int k) {
	        int n = nums.length;
	        int minLength = n + 1;
	        int ors = 0;
	        int[] count = new int[32];

	        for (int left = 0, right = 0; right < n; right++) {
	            ors |= nums[right];
	            for (int bit = 0; bit < 32; bit++) {
	                if ((nums[right] >> bit & 1) == 1) {
	                    count[bit]++;
	                }
	            }
	            
	            while (ors >= k && left <= right) {
	                minLength = Math.min(minLength, right - left + 1);
	                for (int bit = 0; bit < 32; bit++) {
	                    if ((nums[left] >> bit & 1) == 1 && --count[bit] == 0) {
	                        ors ^= (1 << bit);
	                    }
	                }
	                left++;
	            }
	        }
	        
	        return minLength > n ? -1 : minLength;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
