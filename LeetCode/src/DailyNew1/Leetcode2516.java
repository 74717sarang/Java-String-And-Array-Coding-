package DailyNew1;

public class Leetcode2516 {

	 public static int takeCharacters(String s, int k) {
	  if (k == 0) return 0;

      int n = s.length();
      int[] totalCount = new int[3]; // To store the count of 'a', 'b', 'c' in the entire string

      // Count total occurrences of 'a', 'b', 'c' in the string
      for (char ch : s.toCharArray()) {
          totalCount[ch - 'a']++;
      }

      // If any character's total count is less than k, it's impossible
      if (totalCount[0] < k || totalCount[1] < k || totalCount[2] < k) {
          return -1;
      }

      // Sliding window to find the maximum size of a window that can be kept
      // while leaving at least k occurrences of each character outside the window
      int[] windowCount = new int[3];
      int left = 0, maxWindowSize = 0;

      for (int right = 0; right < n; right++) {
          windowCount[s.charAt(right) - 'a']++;

          // If the window violates the condition (leaving less than k outside), shrink it
          while (windowCount[0] > totalCount[0] - k ||
                 windowCount[1] > totalCount[1] - k ||
                 windowCount[2] > totalCount[2] - k) {
              windowCount[s.charAt(left) - 'a']--;
              left++;
          }

          // Update the maximum window size
          maxWindowSize = Math.max(maxWindowSize, right - left + 1);
      }

      // Minimum characters to take = Total length - Maximum window size
      return n - maxWindowSize;
}
	
	
	public static void main(String[] args) {

		 // Example test cases
        System.out.println(takeCharacters("aabaaaacaabc", 2)); // Expected output: 8
        System.out.println(takeCharacters("abc", 1));         // Expected output: 3
        System.out.println(takeCharacters("a", 1));           // Expected output: -1
	}

}
