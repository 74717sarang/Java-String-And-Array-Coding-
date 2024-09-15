package co.string;

public class SplitString {

	
	public static void main(String[] args) {
		
		String s="welcomejava";
		String []str=s.split("(?<=\\G...)");
		System.out.println(str[0]);
		
		for(int i=0;i<str.length;i++) {
			for(int j=1;j<str.length-1;j++) {
				 int n=str[i].compareTo(str[j]);
				if(n>0){
					//System.out.println("in n>0");
					System.out.println(str[i]);
				}
				else  {
					System.out.println(str[i]);	
				}
			}
			
		}
		
	}
}
