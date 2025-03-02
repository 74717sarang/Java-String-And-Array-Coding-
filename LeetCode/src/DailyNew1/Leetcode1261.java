package DailyNew1;

import java.util.HashSet;

import DailyNew1.Leetcode2415.TreeNode;

public class Leetcode1261 {

	class FindElements {
	    HashSet<Integer> set; // Stores all recovered values

	    public FindElements(TreeNode root) {
	        set = new HashSet<>();
	        recoverTree(root, 0);
	    }
	    
	    public boolean find(int target) {
	        return set.contains(target);
	    }

	    private void recoverTree(TreeNode root, int value) {
	        if (root == null) return;
	        set.add(value);
	        root.val = value;
	        recoverTree(root.left, 2 * value + 1);
	        recoverTree(root.right, 2 * value + 2);
	    }
	}
	
	
	
	public static void main(String[] args) {

		
		
	}

}
