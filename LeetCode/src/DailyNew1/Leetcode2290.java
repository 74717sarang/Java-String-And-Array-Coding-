package DailyNew1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode2290 {

	 // use Breadth-First Search or Dijkstra’s algorithm
	 // this Dijkstra’s Algo
	    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	    public int minimumObstacles(int[][] grid) {
	        int m = grid.length, n = grid[0].length;
	        int[][] dist = new int[m][n];
	        for (int[] row : dist) {
	            Arrays.fill(row, Integer.MAX_VALUE);
	        }

	        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
	        pq.offer(new int[]{0, 0, 0});
	        dist[0][0] = 0;

	        while (!pq.isEmpty()) {
	            int[] curr = pq.poll();
	            int x = curr[0], y = curr[1], cost = curr[2];

	            if (x == m - 1 && y == n - 1) return cost;

	            if (cost > dist[x][y]) continue;

	            for (int[] dir : DIRECTIONS) {
	                int nx = x + dir[0], ny = y + dir[1];
	                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
	                    int newCost = cost + grid[nx][ny];
	                    if (newCost < dist[nx][ny]) {
	                        dist[nx][ny] = newCost;
	                        pq.offer(new int[]{nx, ny, newCost});
	                    }
	                }
	            }
	        }

	        return -1; // Unreachable
	    }
	    
	    public static void main(String[] args) {
			
//	    	Input: grid = [[0,1,1],[1,1,0],[1,1,0]]
//	    	Output: 2
	    	
	    	Leetcode2290 obj=new Leetcode2290();
	    	int[][]grid= {{0,1,1},{1,1,0},{1,1,0}};
	    	System.out.println(obj.minimumObstacles(grid));
		}
	

}
