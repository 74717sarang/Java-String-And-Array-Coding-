package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

//	Each node has at most two children (left and right).
//	Use Case: Basic tree structure used in searching, sorting, and representing hierarchical data

	Node root;

	public BinaryTree() {
		root = null;
	}

	private void insert(int i) {
		root = insertRecursion(i, root);
	}

	private Node insertRecursion(int data, Node root) {

		Node node = new Node(data);
		if (root == null) {
			root = node;
		} else if (data < root.data) {
			root.left = insertRecursion(data, root.left);
		} else if (data > root.data) {
			root.right = insertRecursion(data, root.right);
		}
         // this only not ok write with else if 
//		root.left = insertRecursion(data,root.left);
//		root.right = insertRecursion(data,root.right);

		return root;
	}

	public void display_Inorder() {
		if (root == null) {
			System.out.println("Tree Is empty...");
		}
		System.out.println("Inorder Binary Tree...");
		displayRecursive(root);
		System.out.println();
	}

	private void displayRecursive(Node root) {
		if (root != null) {
			displayRecursive(root.left);
			System.out.print(root.data + " ");
			displayRecursive(root.right);
		}
		
	}
	//

	private boolean serach(Node root, int i) {
         if(root==null) {
        	 return false; 
         }
		if(root.data==i) {
			return true;
		}
		return i>root.data ? serach(root.right, i) :serach(root.left, i)   ;
	}
	
    // Method for level-order (depth-wise) traversal of the tree
    
	public void depthwiseTravarsal(Node root) {
		if(root==null) {
          System.out.println("Root is Empty..");
		}
		System.out.println("DepthwiseTravarsal Travarsal...");
       Queue<Node>queue=new LinkedList<>();
       queue.add(root);
       
       while(!queue.isEmpty()) {
    	   
    	   Node cuurentNode=queue.poll();
    	   System.out.print(cuurentNode.data+" ");
    	   if(cuurentNode.left!=null) {
    		   queue.add(cuurentNode.left);
    	   }
    	   if(cuurentNode.right!=null) {
    		   queue.add(cuurentNode.right);
    	   }
    	   
       }
       System.out.println();
       
       
       
	}
	
	
	
	
	

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.insert(15);
		tree.insert(20);
		tree.insert(25);
		tree.insert(5);
		tree.insert(10);

		tree.display_Inorder();
		
		boolean tag=tree.serach(tree.root,25);
		System.out.println("value is ::"+tag);

		
		System.out.println();
		tree.depthwiseTravarsal(tree.root);
		
		
	}


}
