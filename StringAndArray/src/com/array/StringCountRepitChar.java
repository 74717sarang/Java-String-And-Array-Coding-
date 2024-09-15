package com.array;

public class StringCountRepitChar {

	public static void main(String[] args) {
		
		String ch="aaabbbbbcccddd";
		int count=1;
		//char[]ch=str.toCharArray();
		for(int i=0;i<ch.length()-1;i++){
				if(ch.charAt(i)==ch.charAt(i+1)) {
					count++;
				}
				else {
					count=1;
				}
				
			System.out.println("count:"+ch.charAt(i)+count);
	}
		
	}
	
}
