package DailyNew1;

public class Leetcode2429 {
	public static int minimizeXor(int num1, int num2) {
		int count = Integer.bitCount(num2); // Count of 1s in num2
		int result = 0;

		// Set bits from left to right in num1 to match the count
		for (int i = 31; i >= 0 && count > 0; i--) {
			if ((num1 & (1 << i)) != 0) {
				result |= (1 << i);
				count--;
			}
		}

		// Set remaining bits from right to left
		for (int i = 0; i <= 31 && count > 0; i++) {
			if ((result & (1 << i)) == 0) {
				result |= (1 << i);
				count--;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		 // Example test cases
        int num1 = 3, num2 = 5; // Test case 1
        System.out.println("Result for num1 = " + num1 + ", num2 = " + num2 + ": " + minimizeXor(num1, num2));

        num1 = 1; num2 = 12; // Test case 2
        System.out.println("Result for num1 = " + num1 + ", num2 = " + num2 + ": " + minimizeXor(num1, num2));
	}

}
