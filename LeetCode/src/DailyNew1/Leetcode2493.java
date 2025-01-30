package DailyNew1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Leetcode2493 {

	    public int magnificentSets(int n, int[][] edges) {
	        List<List<Integer>> graph = new ArrayList<>();
	        for (int i = 0; i <= n; i++) {
	            graph.add(new ArrayList<>());
	        }
	        for (int[] edge : edges) {
	            graph.get(edge[0]).add(edge[1]);
	            graph.get(edge[1]).add(edge[0]);
	        }

	        int[] color = new int[n + 1]; 
	        Arrays.fill(color, -1); 

	        int maxGroups = 0;

	        for (int i = 1; i <= n; i++) {
	            if (color[i] == -1) {
	                List<Integer> component = new ArrayList<>();
	                if (!isBipartite(i, graph, color, component)) return -1;

	                int localMax = 0;
	                for (int node : component) {
	                    localMax = Math.max(localMax, bfsMaxDepth(node, graph, n));
	                }
	                maxGroups += localMax;
	            }
	        }
	        return maxGroups;
	    }

	    private boolean isBipartite(int node, List<List<Integer>> graph, int[] color, List<Integer> component) {
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(node);
	        color[node] = 0;
	        component.add(node);

	        while (!queue.isEmpty()) {
	            int curr = queue.poll();
	            for (int neighbor : graph.get(curr)) {
	                if (color[neighbor] == -1) {
	                    color[neighbor] = 1 - color[curr];
	                    queue.offer(neighbor);
	                    component.add(neighbor);
	                } else if (color[neighbor] == color[curr]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private int bfsMaxDepth(int start, List<List<Integer>> graph, int n) {
	        Queue<Integer> queue = new LinkedList<>();
	        Map<Integer, Integer> depth = new HashMap<>();
	        queue.offer(start);
	        depth.put(start, 1);
	        int maxDepth = 1;

	        while (!queue.isEmpty()) {
	            int node = queue.poll();
	            for (int neighbor : graph.get(node)) {
	                if (!depth.containsKey(neighbor)) {
	                    depth.put(neighbor, depth.get(node) + 1);
	                    maxDepth = Math.max(maxDepth, depth.get(neighbor));
	                    queue.offer(neighbor);
	                }
	            }
	        }
	        return maxDepth;
	    }
	
	
	
	
	public static void main(String[] args) {

	}

}
