package DailyNew1;

import java.util.Arrays;

public class Leetcode1475 {

	 public static  int[] finalPrices(int[] prices) {
	        int[] result = new int[prices.length];

	        for (int i = 0; i < prices.length; i++) {
	            result[i] = prices[i];
	            for (int j = i + 1; j < prices.length; j++) {
	                if (prices[i] >= prices[j]) {
	                    result[i] = prices[i] - prices[j];
	                    break;
	                }
	            }
	        }
	        return result;
	    }
	
	
	public static void main(String[] args) {

//		Input: prices = [8,4,6,2,3]
//				Output: [4,2,4,2,3]
		int[]prices = {8,4,6,2,3};
		
		System.out.println(Arrays.toString(finalPrices(prices)));
		
		
		
	}

}
