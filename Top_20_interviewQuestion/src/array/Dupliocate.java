package array;

import java.util.HashMap;
import java.util.Map;

public class Dupliocate {

	private static void brute_force(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;

				}
			}
		}

	}

	private static void advance(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

//		map.values().stream().filter(i->i>1).forEach(System.out::println);
		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println(i.getKey());
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 6, 2, 5, 4, 6 };

		System.out.println("Using Brute_force");
		brute_force(arr);
		System.out.println();
		System.out.println("Using HashMap");
		advance(arr);

	}

}
