package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2872 {


	    public int maxKDivisibleComponents(
	        int n,
	        int[][] edges,
	        int[] values,
	        int k
	    ) {
	        // Step 1: Create adjacency list from edges
	        List<Integer>[] adjList = new ArrayList[n];
	        for (int i = 0; i < n; i++) {
	            adjList[i] = new ArrayList<>();
	        }
	        for (int[] edge : edges) {
	            int node1 = edge[0];
	            int node2 = edge[1];
	            adjList[node1].add(node2);
	            adjList[node2].add(node1);
	        }

	        // Step 2: Initialize component count
	        int[] componentCount = new int[1]; // Use array to pass by reference

	        // Step 3: Start DFS traversal from node 0
	        dfs(0, -1, adjList, values, k, componentCount);

	        // Step 4: Return the total number of components
	        return componentCount[0];
	    }

	    private int dfs(
	        int currentNode,
	        int parentNode,
	        List<Integer>[] adjList,
	        int[] nodeValues,
	        int k,
	        int[] componentCount
	    ) {
	        // Step 1: Initialize sum for the current subtree
	        int sum = 0;

	        // Step 2: Traverse all neighbors
	        for (int neighborNode : adjList[currentNode]) {
	            if (neighborNode != parentNode) {
	                // Recursive call to process the subtree rooted at the neighbor
	                sum += dfs(
	                    neighborNode,
	                    currentNode,
	                    adjList,
	                    nodeValues,
	                    k,
	                    componentCount
	                );
	                sum %= k; // Ensure the sum stays within bounds
	            }
	        }

	        // Step 3: Add the value of the current node to the sum
	        sum += nodeValues[currentNode];
	        sum %= k;

	        // Step 4: Check if the sum is divisible by k
	        if (sum == 0) {
	            componentCount[0]++;
	        }

	        // Step 5: Return the computed sum for the current subtree
	        return sum;
	    }
	    
	    
		        
	    
	    public static void main(String[] args) {
	    	Leetcode2872 sol = new Leetcode2872();
	        int n = 6;
	        int[][] edges = {{0, 1}, {1, 2}, {3, 4}, {4, 5}};
	        int[] values = {1, 2, 3, 4, 5, 6};
	        int k = 3;
	        
	        int result = sol.maxKDivisibleComponents(n, edges, values, k);
	        System.out.println("Max K-Divisible Components: " + result); // Output should match the correct result based on inputs
	    }
	

}
