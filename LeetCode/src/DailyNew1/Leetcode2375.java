package DailyNew1;

public class Leetcode2375 {

	public static String smallestNumber(String pattern) {
		int top = 0, s[] = new int[10];

		StringBuilder str = new StringBuilder();
		s[0] = 1;
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == 'I') {
				while (top >= 0)
					str.append(s[top--]);
			}
			s[++top] = i + 2;

		}

		while (top >= 0) {
			str.append(s[top--]);
		}
		return str.toString();

	}

	public static void main(String[] args) {

//		Input: pattern = "IIIDIDDD"
//				Output: "123549876
		
		
		String pattern = "IIIDIDDD";
		System.out.println(smallestNumber(pattern));
	}

}
