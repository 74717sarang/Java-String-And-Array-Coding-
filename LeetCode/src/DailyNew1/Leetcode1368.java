package DailyNew1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leetcode1368 {


	    public static  int minCost(int[][] grid) {
	        int m = grid.length, n = grid[0].length;
	        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // right, left, down, up
	        int[][] cost = new int[m][n];
	        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
	        
	        Deque<int[]> deque = new ArrayDeque<>();
	        deque.offer(new int[]{0, 0, 0}); // {x, y, cost}
	        cost[0][0] = 0;
	        
	        while (!deque.isEmpty()) {
	            int[] curr = deque.poll();
	            int x = curr[0], y = curr[1], currCost = curr[2];
	            
	            for (int i = 0; i < 4; i++) {
	                int nx = x + directions[i][0];
	                int ny = y + directions[i][1];
	                int newCost = currCost + (grid[x][y] == i + 1 ? 0 : 1);
	                
	                if (nx >= 0 && nx < m && ny >= 0 && ny < n && newCost < cost[nx][ny]) {
	                    cost[nx][ny] = newCost;
	                    if (grid[x][y] == i + 1) {
	                        deque.addFirst(new int[]{nx, ny, newCost});
	                    } else {
	                        deque.addLast(new int[]{nx, ny, newCost});
	                    }
	                }
	            }
	        }
	        
	        return cost[m - 1][n - 1];
	    }

	
	
	public static void main(String[] args) {

//		Input: grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
//				Output: 3
		int[][]grid = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
		System.out.println(minCost(grid));
	}

}
