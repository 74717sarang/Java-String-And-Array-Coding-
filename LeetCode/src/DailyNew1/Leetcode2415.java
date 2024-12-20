package DailyNew1;

public class Leetcode2415 {

	
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
	 
	
	
	
	
	 public  TreeNode reverseOddLevels(TreeNode root) {

	        dfs(root.left, root.right, 1);
	        return root;
	    }

	    public void dfs(TreeNode left, TreeNode right, int level) {
	        if (left == null || right == null)
	            return;

	        if (level % 2 == 1) {
	            int temp = left.val;
	            left.val = right.val;
	            right.val = temp;
	        }

	        dfs(left.left, right.right, level + 1);
	        dfs(left.right, right.left, level + 1);

	    }
	
	
	public static void main(String[] args) {

		
//		Input: root = [2,3,5,8,13,21,34]
//				Output: [2,5,3,8,13,21,34]
//				Explanation: 
//				The tree has only one odd level.
//				The nodes at level 1 are 3, 5 respectively, which are reversed and become 5, 3.
		
		int []arr = {2,3,5,8,13,21,34};
//		Leetcode2415 obj=new Leetcode2415();
	
//		System.out.println(obj.reverseOddLevels(root));
		
	}

}
