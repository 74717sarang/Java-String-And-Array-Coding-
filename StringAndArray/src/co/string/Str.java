package co.string;

public class Str {

	
	
	public static void main(String[] args) {
		String str="doselect";
		System.out.println(check(str,2));
	}

	private static String check(String str, int i) {

//		String result="";
		StringBuilder result=new StringBuilder();
		String sub=str.substring(0,i);
		for(int j=i;j<str.length();j++) {
			result.append(str.charAt(j));
		}
		result.append(sub);
		return result.toString();
//		return str.substring(i,str.length())+str.substring(0,i);
	}
}
