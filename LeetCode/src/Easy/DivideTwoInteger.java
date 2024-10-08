package Easy;

public class DivideTwoInteger {

	public int divide(int dividend, int divisor) {
		int sign = 1;
		int quotient = (int) Math.floor(dividend / divisor);

		// to handle special condition
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		return sign * quotient;
	}

	public static void main(String[] args) {

		
		DivideTwoInteger obj = new DivideTwoInteger();

        // Example 1
        int dividend1 = 10, divisor1 = 3;
        System.out.println(obj.divide(dividend1, divisor1)); // Output: 3

        // Example 2
        int dividend2 = 7, divisor2 = -3;
        System.out.println(obj.divide(dividend2, divisor2)); // Output: -2

        // Example 3 (Edge case for overflow)
        int dividend3 = Integer.MIN_VALUE, divisor3 = -1;
        System.out.println(obj.divide(dividend3, divisor3)); // Output: 2147483647 (MAX_INT)
		
	}

}
