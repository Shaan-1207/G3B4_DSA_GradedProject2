package com.greatlearning.gradedproject2.ques02;

public class Main {
	public static void main(String[] args) {

		TransactionBST_ST tree = new TransactionBST_ST();
		System.out.print("Output: ");
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.UpdatingTree(tree.node);
		tree.IteratingTree(tree.newHead);
	}
}
