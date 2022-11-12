package com.greatlearning.gradedproject2.ques02;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class TransactionBST_ST {
	Node node;
	Node prev = null;
	Node newHead = null;

	void UpdatingTree(Node root) {
		if (root == null)
			return;

		// loop till left leaf
		UpdatingTree(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;

		// update new head to hold new root
		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {
			// update the right of predecessor and also the predecessor to Accomodate next
			// node
			prev.right = root;
			root.left = null;
			prev = root;
		}
		UpdatingTree(rightNode);
	}

	void IteratingTree(Node root) {
		// traverse till leaf
		if (root == null)
			return;
		System.out.print(root.data + " ");
		IteratingTree(root.right);
	}
	
	// Hardcoded the tree
	void displaySkewedTree() {
		System.out.print("Converted the BST into a Skewed Tree:: ");
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);
		UpdatingTree(node);
		IteratingTree(newHead);
	}
}