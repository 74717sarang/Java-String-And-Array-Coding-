package Easy;

import java.util.Arrays;

public class SubArrayMaxProduct {

	public static void main(String[] args) {
		int sub = 3;
		int[] arr = new int[] { 4, 5, 6, 1, 2, 3, 7, 10 };
		//this is also ok
		System.out.println(findmaxProduct(arr, sub));
		//for any combination  max product
		System.out.println("simple:"+find(arr,sub));
		//below is best
		System.out.println("proper:" + correctway(arr, sub));

	}

	private static int correctway(int[] arr, int sub) {
		int[] total = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = 1;
			for (int j = i; j < sub; j++) {
				max *= arr[j];
			}
			total[i] = max;
		}
		Arrays.sort(total);
		return total[total.length - 1];
	}

	private static int findmaxProduct(int[] arr, int sub) {
		int maxProduct = 1;
		int currentProduct;
		for (int i = 0; i < sub; i++) {
			maxProduct *= arr[i];
		}
		currentProduct = maxProduct;

		for (int i = sub; i < arr.length; i++) {
			currentProduct = currentProduct / arr[i - sub] * arr[i];
			maxProduct = Math.max(maxProduct, currentProduct);
		}
		return maxProduct;
	}

	public static int find(int[] arr, int k) {
		int max = 1;
		Arrays.sort(arr); // we know last digit * is greter if they are sort for this we sort the array
		for (int j = arr.length - 1; j >= arr.length - k; j--) {
			max *= arr[j];

		}
		return max;
	}

}
