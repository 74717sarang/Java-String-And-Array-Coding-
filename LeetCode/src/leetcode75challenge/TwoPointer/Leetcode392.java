package leetcode75challenge.TwoPointer;

public class Leetcode392 {

	public static boolean isSubsequence(String s, String t) {

        // not work all test case 12/20 run
        // for (int i = 0; i < s.length(); i++) {
        // if (!t.contains(String.valueOf(s.charAt(i)))) {
        // return false;
        // }
        // }
        // return true;


        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
                j++;
        }
        return i == s.length();
    }
	
	
	
	
	public static void main(String[] args) {
		
//		Input: s = "abc", t = "ahbgdc"
//		Output: true
	
	String	s = "abc";
	String t = "ahbgdc";
	System.out.println(isSubsequence(s, t));
	
	
	}
}
