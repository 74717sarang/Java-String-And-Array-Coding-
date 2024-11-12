package Daily;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class leetcode2070 {

	
	    public int[] maximumBeauty(int[][] items, int[] queries) {
	        // Step 1: Sort items by price, if price is the same, sort by beauty in descending order
	        Arrays.sort(items, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));

	        // Step 2: Use a TreeMap to map each unique price to the maximum beauty up to that price
	        TreeMap<Integer, Integer> priceToBeautyMap = new TreeMap<>();
	        int maxBeautySoFar = 0;
	        for (int[] item : items) {
	            maxBeautySoFar = Math.max(maxBeautySoFar, item[1]);
	            priceToBeautyMap.put(item[0], maxBeautySoFar);
	        }

	        // Step 3: Process each query
	        int[] result = new int[queries.length];
	        for (int i = 0; i < queries.length; i++) {
	            Map.Entry<Integer, Integer> entry = priceToBeautyMap.floorEntry(queries[i]);
	            result[i] = (entry != null) ? entry.getValue() : 0;
	        }

	        return result;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
