package Medium;

public class UniquePath {

	public static int uniquePaths(int m, int n) {
        // refter YT lohiha
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    nums[i][j] = 1;
                } 
                else {
                    nums[i][j] = nums[i][j - 1] + nums[i - 1][j];
                }
            }

        }
        return nums[m - 1][n - 1];
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniquePaths(3, 7) );  //28
	}

}
