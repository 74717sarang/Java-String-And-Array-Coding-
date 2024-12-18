package Medium;

import java.util.Arrays;

public class RotateMatrix {

	public void rotate(int[][] matrix) {

		int n = matrix.length;

		// transpose matrix
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];  //ij=ji
				matrix[j][i] = temp;
			}
		}

		// reverse each row
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

		RotateMatrix matrix2 = new RotateMatrix();
		System.out.println(Arrays.deepToString(matrix));
		System.out.println("After rorarte");
		matrix2.rotate(matrix);
		System.out.println(Arrays.deepToString(matrix));

		System.out.println();
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
