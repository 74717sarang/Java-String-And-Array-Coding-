package Daily;

import java.util.HashMap;
import java.util.Map;

public class MakeDivisibleByNum {
	    long sum = 0;

	    public int minSubarray(int[] nums, int p) {

	        Map<Long, Integer> map = new HashMap<>();

	        for (int i : nums) {
	            sum += i;
	        }
	        long target = sum % p;

	        if (target == 0) {
	            return 0;
	        }
	        map.put(0L, -1);

	        int length = nums.length;
	        long prefixSum = 0L;

	        for (int i = 0; i < nums.length; i++) {

	            prefixSum = (prefixSum + nums[i]) % p;
	            long needed = (prefixSum - target + p) % p;

	            if (map.containsKey(needed)) {
	                length = Math.min(length, i - map.get(needed));
	            }
	            map.put(prefixSum, i);
	        }
	        return length == nums.length ? -1 : length;
	    }

	    public static void main(String[] args) {
	        
	    	MakeDivisibleByNum solution = new MakeDivisibleByNum();
	        
	        // Example 1
	        int[] nums1 = {3, 1, 4, 2};
	        int p1 = 6;
	        System.out.println(solution.minSubarray(nums1, p1));  // Output: 1

	        // Example 2
	        int[] nums2 = {6, 3, 5, 2};
	        int p2 = 9;
	        System.out.println(solution.minSubarray(nums2, p2));  // Output: 2

	        // Example 3
	        int[] nums3 = {1, 2, 3};
	        int p3 = 3;
	        System.out.println(solution.minSubarray(nums3, p3));  // Output: 0
	    }
	
	
}
