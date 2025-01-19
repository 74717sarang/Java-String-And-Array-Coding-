package tric;

import java.awt.image.SampleModel;

public class ArraySecondlargestele {

	private static int findSecoundLargestEle(int[] arr) {
		int large = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int no : arr) {
			if (no > large) { // if no grether than large then update both
				secondlargest = large;
				large = no;

			}
			// if no is less than large and grether than secoundlarge update secoundlarge
			else if (no < large && no > secondlargest) {
				secondlargest = no;
			}
		}

		return secondlargest;
	}

	private static int findSecoundSmallestEle(int[] arr) {

		int small = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int no : arr) {
			if (no < small) {
				secondSmallest = small;
				small = no;
			} else if (no < secondSmallest && no > small) {
				secondSmallest = no;
			}

		}

		return secondSmallest;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 8, 9, 7, 5, 4, 2 };
		System.out.println("SecoundLargestElement=" + findSecoundLargestEle(arr));
		// 8

		System.out.println("SecoundSmallestElement=" + findSecoundSmallestEle(arr));
		// 2

	}

}
