package DailyNew1;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2981 {

	    public int longestSpecialSubstring(String s) {
	        int n = s.length();
	        int left = 1, right = n / 3, result = 0;

	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (canFindThreeOccurrences(s, mid)) {
	                result = mid;
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    private boolean canFindThreeOccurrences(String s, int len) {
	        int n = s.length();
	        Map<String, Integer> countMap = new HashMap<>();

	        for (int i = 0; i <= n - len; i++) {
	            String substr = s.substring(i, i + len);
	            countMap.put(substr, countMap.getOrDefault(substr, 0) + 1);
	            if (countMap.get(substr) == 3) {
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
	
		String s = "your_input_string";
		Leetcode2981 solution=new Leetcode2981();;
		int result = solution.longestSpecialSubstring(s);
		System.out.println(result);

		
	} 
	
}
