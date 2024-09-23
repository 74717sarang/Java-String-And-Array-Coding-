package co.string;

import java.util.Stack;

public class RemoveChar {

	public static void main(String[] args) {

		String str1 = "AABBCC";
		String str2 = "ABCDDSD";
		String str = "[" + str2 + "]";
		

		str = str1.replaceAll(str, "");
		if (str != "") {
			System.out.println("Direct::" + str);
		} else {
			System.out.println("Empty");
		}

		// with function trenary operator 2>1 ? tr:fl
		String s = remove(str1, str2);
		System.out.println("Remening::" + s.isEmpty() != null ? "empty" : s);
	}

	private static String remove(String str1, String str2) {
		StringBuilder str = new StringBuilder();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			boolean tag = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					break;
				}
			}
			str.append(arr1[i]);
			
		}
		return str.toString();
	}
}
