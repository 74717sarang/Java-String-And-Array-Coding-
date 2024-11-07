package Daily;

public class leetcode3011 {

	public boolean canBeSorted(int[] nums) {
        int preMx = -300;
       int i = 0, n = nums.length;
       while (i < n) {
           int j = i + 1;
           int cnt = Integer.bitCount(nums[i]);
           int mi = nums[i], mx = nums[i];
           while (j < n && Integer.bitCount(nums[j]) == cnt) {
               mi = Math.min(mi, nums[j]);
               mx = Math.max(mx, nums[j]);
               j++;
           }
           if (preMx > mi) {
               return false;
           }
           preMx = mx;
           i = j;
       }
       return true;
   }
	
	
	public static void main(String[] args) {
		
		
		leetcode3011 obj = new leetcode3011();
	        
	        int[] nums1 = {8, 4, 2, 30, 15};
	        System.out.println("Example 1: " + obj.canBeSorted(nums1));  // Output: true
	        
	        int[] nums2 = {1, 2, 3, 4, 5};
	        System.out.println("Example 2: " + obj.canBeSorted(nums2));  // Output: true
	        
	        int[] nums3 = {3, 16, 8, 4, 2};
	        System.out.println("Example 3: " + obj.canBeSorted(nums3));  // Output: false
	}


		
}
