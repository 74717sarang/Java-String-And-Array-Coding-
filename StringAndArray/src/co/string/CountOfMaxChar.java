package co.string;

import java.util.Arrays;

public class CountOfMaxChar {

	public static void main(String[] args) {

		String str = "abcaaawel wel wel z";
		int[] arr = new int[27];
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				int i = ch - '0' - 48;
				arr[i] = arr[i] + 1;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("After");
		int d = 'a';
		int x = '0';
		int t = 'z' - '0' - 48;
		Arrays.toString(arr);
//		System.out.println('a'-'0');
////		System.out.println("a::"+d);
////		System.out.println("0::"+x);
//		System.out.println("t::"+t);
		System.out.println();
		
//		for (int i : arr) {
//			if(i!=0)
//			System.out.print(i + " ");
//		}
		
		
	}

}
