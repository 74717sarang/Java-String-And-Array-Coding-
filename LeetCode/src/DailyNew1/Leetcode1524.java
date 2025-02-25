package DailyNew1;

public class Leetcode1524 {

	public static int numOfSubarrays(int[] arr) {

		int mod = 1000000007;
		int even = 1, odd = 0, result = 0, sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum % 2 == 1) {
				result = (result + even) % mod;
				odd++;
			} else {
				result = (result + odd) % mod;
				even++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };
		// 4
		System.out.println(numOfSubarrays(arr));
	}

}
