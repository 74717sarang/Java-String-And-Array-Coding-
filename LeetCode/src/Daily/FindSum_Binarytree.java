package Daily;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.tree.TreeNode;

//leetcode2583
public class FindSum_Binarytree {

	public long kthLargestLevelSum(TreeNode root, int k) {

		if (root == null) return -1;

		        // Min-heap to store the k largest sums
		        PriorityQueue<Long> minHeap = new PriorityQueue<>();
		        
		        // Queue for level order traversal
		        Queue<TreeNode> queue = new LinkedList<>();
		        queue.add(root);

		        while (!queue.isEmpty()) {
		            int levelSize = queue.size();
		            long levelSum = 0;

		            // Traverse nodes at the current level
		            for (int i = 0; i < levelSize; i++) {
		                TreeNode current = queue.poll();
//		                levelSum += current.val;

//		                if (current.left != null) queue.add(current.left);
//		                if (current.right != null) queue.add(current.right);
		            }

		            // Add the sum to the min-heap
		            minHeap.add(levelSum);
		            if (minHeap.size() > k) {
		                minHeap.poll(); // Remove the smallest sum
		            }
		        }

		        return minHeap.size() == k ? minHeap.peek() : -1;


		    }
	
//	 class TreeNode {
//		      int val;
//		 *     TreeNode left;
//		 *     TreeNode right;
//		 *     TreeNode() {}
//		 *     TreeNode(int val) { this.val = val; }
//		 *     TreeNode(int val, TreeNode left, TreeNode right) {
//		 *         this.val = val;
//		 *         this.left = left;
//		 *         this.right = right;
//		 *     }
//		 * }
	
	public static void main(String[] args) {

//	     Solution solution = new Solution();

	        // Sample Tree: [5, 8, 9, 2, 1, 6]
//	        TreeNode root = new TreeNode(5);
//	        root.left = new TreeNode(8);
//	        root.right = new TreeNode(9);
//	        root.left.left = new TreeNode(2);
//	        root.left.right = new TreeNode(1);
//	        root.right.left = new TreeNode(6);

	        int k = 2; // Find the 2nd largest level sum
//	        System.out.println("Kth Largest Level Sum: " + solution.kthLargestLevelSum(root, k)); // Expected Output: 13
		
	}

}
