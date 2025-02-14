package com.array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void findDuplicate(int[] arr, int len) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println(i.getKey() + " times " + i.getValue());
			}
		}
	}

	public static void findDuplicatewithArray(int[] arr, int len) {

		int[] frq = new int[len];

		for (int i = 0; i < len; i++) {
			frq[arr[i]]++;
		}

		for (int i = 0; i < len; i++) {
			if (frq[i] > 1) {
				System.out.println(arr[i]);
				frq[arr[i]]=0;
			}
		}

	}

	public static void main(String[] args) {

		int n = 10;
		int len = 7, arr[] = { 1, 2, 3, 6, 3, 6, 1 };

		findDuplicate(arr, len);
		System.out.println();
		findDuplicatewithArray(arr, len);

	}

}
