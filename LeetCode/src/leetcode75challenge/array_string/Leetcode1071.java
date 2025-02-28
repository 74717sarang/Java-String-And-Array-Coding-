package leetcode75challenge.array_string;

public class Leetcode1071 {

	public static String gcdOfStrings(String str1, String str2) {
	 if (!(str1 + str2).equals(str2 + str1)) {
         return "";
     }
     int gcdLength = gcd(str1.length(), str2.length());

     // Return the substring of str1 up to the GCD length
     return str1.substring(0, gcdLength);
 }
  private static int gcd(int a, int b) {
     return b == 0 ? a : gcd(b, a % b);
 }
	public static void main(String[] args) {

		System.out.println(gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));   // Output: ""
	}

}
