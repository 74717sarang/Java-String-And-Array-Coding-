package co.string;

public class StringToInteger {
	
	private static int convertInteger(String str) {
		int num=0;
		for(char ch:str.toCharArray()) {
			num=num*10+(ch-'0');
		}
		return num;
	}
	



	private static int newconvertInteger(String str) {
        char[] ch=str.toCharArray();
        int num=0;int factor=1;
		for(int i=ch.length-1;i>=0;i--) {
			num+=(ch[i]-'0')*factor;
			factor*=10;
		}
		
		return num;
	}
	
	
	public static void main(String[] args) {

		String str="12345";
		System.out.println(convertInteger(str));
		System.out.println(newconvertInteger(str));
		
		
	}
}
