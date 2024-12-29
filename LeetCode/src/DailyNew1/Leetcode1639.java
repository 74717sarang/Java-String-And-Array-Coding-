package DailyNew1;

public class Leetcode1639 {

	    public int numWays(String[] words, String target) {
	        int mod = 1_000_000_007;
	        int m = target.length();
	        int n = words[0].length();
	        
	        // Count character frequencies in each column
	        int[][] freq = new int[26][n];
	        for (String word : words) {
	            for (int i = 0; i < n; i++) {
	                freq[word.charAt(i) - 'a'][i]++;
	            }
	        }
	        
	        // DP array
	        long[] dp = new long[m + 1];
	        dp[0] = 1;
	        
	        // Iterate over columns in reverse order
	        for (int j = 0; j < n; j++) {
	            for (int i = m - 1; i >= 0; i--) {
	                if (target.charAt(i) - 'a' >= 0 && target.charAt(i) - 'a' < 26) {
	                    dp[i + 1] += dp[i] * freq[target.charAt(i) - 'a'][j] % mod;
	                    dp[i + 1] %= mod;
	                }
	            }
	        }
	        
	        return (int) dp[m];
	    }
	
	
	
	public static void main(String[] args) {

		
		
	}

}
