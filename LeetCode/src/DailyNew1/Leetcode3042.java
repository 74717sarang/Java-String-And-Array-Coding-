package DailyNew1;

public class Leetcode3042 {

	    public  static int countPrefixSuffixPairs(String[] words) {
	        int ans = 0;
	        int n = words.length;
	        for (int i = 0; i < n; ++i) {
	            String s = words[i];
	            for (int j = i + 1; j < n; ++j) {
	                String t = words[j];
	                if (t.startsWith(s) && t.endsWith(s)) {
	                    ++ans;
	                }
	            }
	        }
	        return ans;
	    }
	
	
	
	public static void main(String[] args) {

//		Input: words = ["a","aba","ababa","aa"]
//				Output: 4
		String[]words = {"a","aba","ababa","aa"};
		System.out.println(countPrefixSuffixPairs(words));
	}

}
