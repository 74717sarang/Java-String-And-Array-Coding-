package DailyNew1;

public class Leetcode3174 {

	private static String clareDigit(String s) {

		StringBuilder str=new StringBuilder();
		
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				if(str.length()>0) {
					str.deleteCharAt(str.length()-1);
				}
			}else {
				str.append(c);
			}
		}
		
		
		return str.toString()
				;
	}

	public static void main(String[] args) {

		String s = "acb";
	
		System.out.println(clareDigit(s));
	}

}
