package DailyNew1;

import java.util.PriorityQueue;

public class Leetcode407 {

	
	
	    private static class Cell {
	        int row, col, height;
	        
	        Cell(int row, int col, int height) {
	            this.row = row;
	            this.col = col;
	            this.height = height;
	        }
	    }

	    public int trapRainWater(int[][] heightMap) {
	        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
	            return 0;
	        }

	        int rows = heightMap.length;
	        int cols = heightMap[0].length;
	        boolean[][] visited = new boolean[rows][cols];
	        PriorityQueue<Cell> minHeap = new PriorityQueue<>((a, b) -> a.height - b.height);

	        // Add all border cells to the heap
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
	                    minHeap.offer(new Cell(i, j, heightMap[i][j]));
	                    visited[i][j] = true;
	                }
	            }
	        }

	        // Directions for moving in 4 directions
	        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	        int waterTrapped = 0;

	        // Process the heap
	        while (!minHeap.isEmpty()) {
	            Cell cell = minHeap.poll();

	            for (int[] dir : directions) {
	                int newRow = cell.row + dir[0];
	                int newCol = cell.col + dir[1];

	                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
	                    visited[newRow][newCol] = true;
	                    waterTrapped += Math.max(0, cell.height - heightMap[newRow][newCol]);
	                    minHeap.offer(new Cell(newRow, newCol, Math.max(cell.height, heightMap[newRow][newCol])));
	                }
	            }
	        }

	        return waterTrapped;
	    }

	    public static void main(String[] args) {
	    	Leetcode407 solution = new Leetcode407
	    			();
	        int[][] heightMap = {
	            {1, 4, 3, 1, 3, 2},
	            {3, 2, 1, 3, 2, 4},
	            {2, 3, 3, 2, 3, 1}
	        };
	        System.out.println(solution.trapRainWater(heightMap)); // Output: 4
	    }

}
