package com.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders_in_array {

	private static int[] findLeaders(int[] arr) {

		int n = arr.length;
		int k = 0;
		int[] result = new int[n];

		int max = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
				result[k++] = max;
			}
		}
		result[k++] = arr[n - 1];
		return result;
	}

	private static int[] findLeadersEfficient(int[] arr) {

		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		list.add(arr[n - 1]);

		int max = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
				list.add(max);

			}
		}

		int[] result = new int[list.size()];

		for (int i = list.size() - 1; i >= 0; i--) {
			result[list.size() - i - 1] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 16, 17, 4, 3, 5, 2 };
		System.out.println("Leaders in the array: " + Arrays.toString(findLeaders(arr)));
		System.out.println("Leaders in the array: " + Arrays.toString(findLeadersEfficient(arr)));

	}

}
