package DailyNew1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode515 {

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
	 
	    public List<Integer> largestValues(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if (root == null) return result;

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            int max = Integer.MIN_VALUE;

	            for (int i = 0; i < size; i++) {
	                TreeNode node = queue.poll();
	                max = Math.max(max, node.val);

	                if (node.left != null) queue.offer(node.left);
	                if (node.right != null) queue.offer(node.right);
	            }

	            result.add(max);
	        }

	        return result;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
