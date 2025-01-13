package DailyNew1;

public class Leetcode3223 {

	    public  static int minimumLength(String s) {
	        int[] count = new int[26];
	        for (char c : s.toCharArray()) {
	            count[c - 'a']++;
	        }
	        int result = 0;
	        for (int i : count) {
	            if (i > 0) {
	                result += (i % 2 == 0) ? 2 : 1;
	            }
	        }

	        return result;
	    }
	
	
	public static void main(String[] args) {
//		Input: s = "abaacbcbb"
//				Output: 5
 
		 String s = "abaacbcbb";
		 System.out.println(minimumLength(s));

	
	}

}
