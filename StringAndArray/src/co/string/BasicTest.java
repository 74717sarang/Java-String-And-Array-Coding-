package co.string;

public class BasicTest {

	public static void main(String[] args) {
		/*
		 * String a="hello"; String b="java";
		 * System.out.println(a.charAt(0)-b.charAt(0));
		 * 
		 * String s= convert(a); String s2=convert(b);
		 * 
		 * System.out.println(s+" "+s2);
		 */
		String str = "big black bug bit a big black dog";

		//System.out.println(changer(str));
		System.out.println("hii");
		String s="";
		for(int i=0;i<str.length();i++) {
			
		  System.out.println();
		 
		}
         System.out.println(s);
	}

	public static String changer(String str) {

		String s5 = "";
		if (str == null && str.length() == 0)
			return " empty String!!!!";

		String[] newstr = str.split(" ");
		for (int i = 0; i < newstr.length; i++) {

			s5 += newstr[i].substring(0, 1).toUpperCase() + newstr[i].substring(1) + " ";
		}

		return s5;
	}

	public static String convert(String s) {

		if (s == null && s.length() == 0)
			return " empty String!!!!";

		String s1 = s.substring(0, 1).toUpperCase() + s.substring(1);
		return s1;

	}
	
	
	
}
