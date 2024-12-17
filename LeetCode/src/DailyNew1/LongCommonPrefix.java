package DailyNew1;

//leetcode 14
public class LongCommonPrefix {

	public static void main(String[] args) {
		LongCommonPrefix solution = new LongCommonPrefix();
		String[] strs1 = { "flower", "flow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		System.out.println("Longest Common Prefix (Example 1): " + solution.longestCommonPrefix(strs1)); // Output: "fl"
		System.out.println("Longest Common Prefix (Example 1): " + solution.longestCommonPrefix(strs2)); //       : ""
																									
	}

	private String longestCommonPrefix(String[] str) {
		String s=str[0];
		 
		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(s)!=0) {
				s=s.substring(0,s.length()-1);
				if(s.isEmpty()) return "";
			}
		}
		
		
		return s;
	}
}