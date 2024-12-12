package co.string;

import java.util.Arrays;

public class Test {

	
	public static void main(String[] args) {
		String str="the new string come";
		String[]strArr=str.split(" ");
		
		for(int i=0;i<strArr.length;i++) {
			strArr[i]=new StringBuffer(strArr[i]).reverse().toString();
		}
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(strArr));
	}
}
