package DailyNew1;

public class Leetcode2466 {

	public static  int countGoodStrings(int low, int high, int zero, int one) {
		int mod = 1000000007;
		int[] dp = new int[high + 1];
		dp[0] = 1;

		for (int i = 1; i <= high; i++) {
			if (i >= zero) {
				dp[i] = (dp[i] + dp[i - zero]) % mod;
			}
			if (i >= one) {
				dp[i] = (dp[i] + dp[i - one]) % mod;
			}
		}

		int result = 0;
		for (int i = low; i <= high; i++) {
			result = (result + dp[i]) % mod;
		}
		return result;
	}

	public static void main(String[] args) {

//		Input: low = 3, high = 3, zero = 1, one = 1
//				Output: 8
	
		int low = 3; int high = 3;
		int zero = 1; int one = 1;
		System.out.println(countGoodStrings(low, high, zero, one)); 
	
	}

}
