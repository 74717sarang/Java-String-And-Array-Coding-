package Daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankForArrayEmlent {

	public static int[] rank(int[] arr) {

		int[] sortarr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortarr);
		Map<Integer, Integer> map = new HashMap<>();
		int rank = 1;
		for (int num : sortarr) {
			if (!map.containsKey(num)) {
				map.put(num, rank++);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = map.get(arr[i]);
		}

		return arr;
	}

	public static void main(String[] args) {

		int[] arr1 = { 40, 10, 20, 30 };
		int[] result1 = rank(arr1);
		System.out.println(Arrays.toString(result1)); // Output: [4, 1, 2, 3]

		int[] arr2 = { 100, 100, 100 };
		int[] result2 = rank(arr2);
		System.out.println(Arrays.toString(result2)); // Output: [1, 1, 1]

		int[] arr3 = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
		int[] result3 = rank(arr3);
		System.out.println(Arrays.toString(result3)); // Output: [5, 3, 4, 2, 8, 6, 7, 1, 3]
	}

}
