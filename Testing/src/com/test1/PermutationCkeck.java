package com.test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationCkeck {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "dcabe";
		System.out.println("Ckeck::" + checkPermutation(str1, str2));
		System.out.println("Ckeck Other::" + check(str1, str2));

	}

	
	
	private static boolean check(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2) ;
	}

	
	
	
	private static boolean checkPermutation(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		boolean tag = true;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			map.put(str1.charAt(i), i);
		}

		for (int i = 0; i < str2.length(); i++) {
			if (!map.containsKey(str2.charAt(i))) {
				tag = false;
			}
		}
		return tag;
	}
}
