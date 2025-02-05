package DailyNew1;

public class Leetcode1790 {

	public static boolean areAlmostEqual(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		// if(s1.length()==2){
		// return (s1.charAt(0)!=s2.charAt(0))&&(s1.charAt(1)!=s2.charAt(1));
		// }

//	          int first
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
			}
		}
		// if(count==0) return false;

		return count > 2 ? false : true;
	}

	public static void main(String[] args) {

//		Input: s1 = "bank", s2 = "kanb"
//		Output: true
//	    Explanation: For example, swap the first character with the last character of s2 to make "bank".
		
		String  s1 = "bank", s2 = "kanb";
		System.out.println(areAlmostEqual(s1, s2));
		
	}

}
