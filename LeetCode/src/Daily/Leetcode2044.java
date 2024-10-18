package Daily;

import java.util.HashMap;

public class Leetcode2044 {

	public static int countMaxOrSubsets(int[] nums) {
        // Step 1: Find the maximum possible OR value by OR-ing all elements
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }

        // Step 2: Use a HashMap to store the number of times each OR value occurs
        HashMap<Integer, Integer> orCount = new HashMap<>();
        orCount.put(0, 1); // Start with empty subset, which has OR value 0
        
        // Step 3: Iterate through each number and update the OR combinations
        for (int num : nums) {
            HashMap<Integer, Integer> currentOrCount = new HashMap<>(orCount); // Copy current state
            for (int existingOr : currentOrCount.keySet()) {
                int newOr = existingOr | num; // Form a new OR value by adding this number
                orCount.put(newOr, orCount.getOrDefault(newOr, 0) + currentOrCount.get(existingOr));
            }
        }

        // Step 4: Return the count of subsets that have the maximum OR value
        return orCount.getOrDefault(maxOr, 0);
    }
	
	
	public static void main(String[] args) {
		//Leetcode2044 leetcode2044=new Leetcode2044();
		int []arr= {3,2,1,5};
	System.out.println(countMaxOrSubsets(arr));
		
		
	}
	
	
}
