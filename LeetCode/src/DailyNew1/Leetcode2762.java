package DailyNew1;

import java.util.TreeMap;

public class Leetcode2762 {

	 public  long continuousSubarrays(int[] nums) {
	       TreeMap<Integer, Integer> map = new TreeMap<>();
	        int left = 0;
	        long count = 0;

	        for (int right = 0; right < nums.length; right++) {
	            // Add the current element to the TreeMap
	            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

	            // Ensure the difference between max and min <= 2
	            while (map.lastKey() - map.firstKey() > 2) {
	                int leftNum = nums[left];
	                map.put(leftNum, map.get(leftNum) - 1);
	                if (map.get(leftNum) == 0) {
	                    map.remove(leftNum);
	                }
	                left++;
	            }

	            // Count subarrays ending at 'right'
	            count += right - left + 1;
	        }

	        return count; 
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leetcode2762 solution = new Leetcode2762();
	        int[] nums = {1, 2, 3};
	        System.out.println(solution.continuousSubarrays(nums)); // Output: 6
	}

}
