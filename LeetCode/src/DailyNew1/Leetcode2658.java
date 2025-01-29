package DailyNew1;

public class Leetcode2658 {

	public int findMaxFish(int[][] grid) {
		int maxFish = 0;
		int rows = grid.length;
		int cols = grid[0].length;
		boolean[][] visited = new boolean[rows][cols];

		// Traverse all cells in the grid
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// If the cell has fish and has not been visited, start DFS
				if (grid[i][j] > 0 && !visited[i][j]) {
					maxFish = Math.max(maxFish, dfs(grid, visited, i, j));
				}
			}
		}

		return maxFish;
	}

	// Helper method to calculate the number of fish using DFS
	public int dfs(int[][] grid, boolean[][] visited, int row, int col) {
		// Base cases: Out of bounds or already visited or no fish
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col]
				|| grid[row][col] == 0) {
			return 0;
		}

		// Mark the cell as visited
		visited[row][col] = true;

		// Collect fish from the current cell
		int fish = grid[row][col];

		// Explore all 4 possible directions
		fish += dfs(grid, visited, row + 1, col); // Down
		fish += dfs(grid, visited, row - 1, col); // Up
		fish += dfs(grid, visited, row, col + 1); // Right
		fish += dfs(grid, visited, row, col - 1); // Left

		return fish;
	}

	public static void main(String[] args) {
		Leetcode2658 solution = new Leetcode2658();
		int[][] grid = { { 0, 2, 1, 0 }, { 4, 0, 0, 3 }, { 1, 0, 0, 4 }, { 0, 3, 2, 0 } };
		System.out.println(solution.findMaxFish(grid)); // Output: 7
	}

}
