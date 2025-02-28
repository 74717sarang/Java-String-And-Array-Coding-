package leetcode75challenge.array_string;

public class Reverse_WordInString {

	public static  String reverseWords(String s) {
		String[] str = s.split("\\s+");// handle extra space
		// "\\s+" => one or more space
		String result = "";
		for (int i = str.length - 1; i >= 0; i--) {
			if (!(str[i].equals(" "))) {
				result += str[i];
				result += " ";
			}
		}
		return result.trim();
	}

	public static void main(String[] args) {
//	    	Input: s = "the sky is blue"
//	    	Output: "blue is sky the"
		String s="the sky is blue";
		System.out.println(reverseWords(s));
		}
}
