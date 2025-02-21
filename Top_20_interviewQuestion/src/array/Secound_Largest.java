package array;

public class Secound_Largest {

	private static int brute_force(int[] arr) {

		// we can direct use sort() over array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[arr.length - 2];
	}

	private static int advance(int[] arr) {

		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];

			} else if (arr[i] < large && arr[i] > secondLarge) {
				secondLarge = arr[i];
			}

		}
		return secondLarge;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 39, 6, 9, 5, 99 };

		System.out.println("Brute_force");
		System.out.println(brute_force(arr));
		System.out.println("Advance");
		System.out.println(advance(arr));
	}

}
