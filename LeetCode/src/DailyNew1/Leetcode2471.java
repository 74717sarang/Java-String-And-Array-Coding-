package DailyNew1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Leetcode2471 {

	
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	
	
	
	    public int minimumOperations(TreeNode root) {
	        if (root == null) return 0;

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        int operations = 0;

	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            List<Integer> level = new ArrayList<>();

	            for (int i = 0; i < size; i++) {
	                TreeNode node = queue.poll();
	                level.add(node.val);

	                if (node.left != null) queue.add(node.left);
	                if (node.right != null) queue.add(node.right);
	            }

	            operations += countSwaps(level);
	        }

	        return operations;
	    }

	    private int countSwaps(List<Integer> nums) {
	        int n = nums.size();
	        int[] arr = nums.stream().mapToInt(i -> i).toArray();
	        int[] sortedArr = arr.clone();
	        Arrays.sort(sortedArr);

	        Map<Integer, Integer> indexMap = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            indexMap.put(sortedArr[i], i);
	        }

	        boolean[] visited = new boolean[n];
	        int swaps = 0;

	        for (int i = 0; i < n; i++) {
	            if (visited[i] || arr[i] == sortedArr[i]) continue;

	            int cycleSize = 0;
	            int j = i;

	            while (!visited[j]) {
	                visited[j] = true;
	                j = indexMap.get(arr[j]);
	                cycleSize++;
	            }

	            if (cycleSize > 1) swaps += cycleSize - 1;
	        }

	        return swaps;
	    }
	
	    
	    public static void main(String[] args) {
			
	    	
	    	
		}
}
