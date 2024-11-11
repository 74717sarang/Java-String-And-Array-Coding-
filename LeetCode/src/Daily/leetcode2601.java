package Daily;

import java.util.ArrayList;

public class leetcode2601 {

	    public boolean primeSubOperation(int[] nums) {
	        int[] primes = generatePrimesUpTo(1000); // Generate primes up to 1000
	        int prev = 0;
	        
	        for (int i = 0; i < nums.length; i++) {
	            int target = nums[i];
	            
	            for (int j = primes.length - 1; j >= 0; j--) {
	                if (target - primes[j] > prev) {
	                    target -= primes[j];
	                    break;
	                }
	            }
	            
	            if (target <= prev) {
	                return false;
	            }
	            
	            prev = target;
	        }
	        
	        return true;
	    }
	    
	    private int[] generatePrimesUpTo(int max) {
	        boolean[] isPrime = new boolean[max + 1];
	        ArrayList<Integer> primeList = new ArrayList<>();
	        isPrime[0] = isPrime[1] = false;
	        
	        for (int i = 2; i <= max; i++) {
	            isPrime[i] = true;
	        }
	        
	        for (int i = 2; i * i <= max; i++) {
	            if (isPrime[i]) {
	                for (int j = i * i; j <= max; j += i) {
	                    isPrime[j] = false;
	                }
	            }
	        }
	        
	        for (int i = 2; i <= max; i++) {
	            if (isPrime[i]) {
	                primeList.add(i);
	            }
	        }
	        
	        // Convert ArrayList to int[]
	        return primeList.stream().mapToInt(Integer::intValue).toArray();
	    }
	

	
	
	public static void main(String[] args) {

		
		
		
	}
}
