package com.tree;

public class BinarySearchTree {
 // BinarySearchTree is a tree that is store in sorted order data 
//	and left node is less than root node and right node is grethter than root node
	
//	Efficient searching, insertion, and deletion (O(log n) time complexity).

	Node root;
    public BinarySearchTree() {
    	root=null;
    }
	
	
	private void insert(int data) {
		root = insetrtRec(data, root);

	}

	public Node insetrtRec(int data, Node root) {
		if (root == null) {
			root = new Node(data);
		} else if (data < root.data) {
			root.left = insetrtRec(data, root.left);
		} else if (data > root.data) {
			root.right = insetrtRec(data, root.right);
		}
		return root;
	}

	public void display_inOrder() {
		System.out.println("inOrder Travarsal");
		inoderRecursion(root);
		System.out.println();
	}

	private void inoderRecursion(Node root) {

		if (root != null) {
			inoderRecursion(root.left);
			System.out.print(root.data + " ");
			inoderRecursion(root.right);

		}

	}

	public void display_preOrder() {

		System.out.println("PreOrder Travarsal");
		preOrderRecursion(root);
		System.out.println();
	}

	private Node preOrderRecursion(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			preOrderRecursion(root.left);
			preOrderRecursion(root.right);

		}
		return root;
	}

	public void display_postOrder() {
		System.out.println("PostOrder Travarsal");
		postOrderRecursion(root);
		System.out.println();
	}

	private Node postOrderRecursion(Node root) {
		
		if(root!=null) {
			postOrderRecursion(root.left);
			postOrderRecursion(root.right);
			System.out.print(root.data+" ");
		}
		
		return root;
	}


	private boolean serach(Node root, int i) {
        if(root==null) {
        	return false;
        	
        }
		if(root.data==i) {
			return true
					;
		}
		
		return i < root.data ? serach(root.left, i) :serach(root.right, i) ;
	}
	
	
	
	
	
	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
    	tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);

		tree.display_inOrder();
		tree.display_preOrder();
		tree.display_postOrder();
		
		boolean tag=  tree.serach(tree.root,15);
		System.out.println();
		System.out.println("value is ::"+tag);
		
	}



}
