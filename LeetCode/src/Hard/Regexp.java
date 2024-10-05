package Hard;

public class Regexp {

	public boolean isMatch(String s, String p) {
		int m = s.length();
		int n = p.length();

		// DP table
		boolean[][] dp = new boolean[m + 1][n + 1];

		// Base case: empty string matches empty pattern
		dp[0][0] = true;

		// Initialize dp for patterns like a*, a*b*, a*b*c*, etc.
		for (int j = 1; j <= n; j++) {
			if (p.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 2]; // '*' can match zero of the previous element
			}
		}

		// Fill the DP table
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// If the current characters match or if p[j-1] is '.', we check dp[i-1][j-1]
				if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				// If p[j-1] is '*', it can match zero or more of the previous character
				else if (p.charAt(j - 1) == '*') {
					// Zero occurrences of the character before '*'
					dp[i][j] = dp[i][j - 2];

					// If the previous character matches the current character in s, we check
					// dp[i-1][j]
					if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
						dp[i][j] = dp[i][j] || dp[i - 1][j];
					}
				}
			}
		}

		return dp[m][n]; // Final result
	}

	public static void main(String[] args) {

		Regexp solution = new Regexp();

		  //  Test cases 
		System.out.println(solution.isMatch("aa", "a"));  //  Output: false 

		System.out.println(solution.isMatch("aa", "a*")); // Output: true 
		
		System.out.println(solution.isMatch("ab", ".*")); // Output: true
		 		 
		
		
	
	}

}
