package com.home.datasturctures;

public class BinaryTreeTravelsal {

	BinaryTreeNode root;
	
	
	public void preOrderTraversal(BinaryTreeNode tree) {
		if(tree == null) {
			return;
		}
		System.out.print(tree.data + " - ");
		preOrderTraversal(tree.leftNode);
		preOrderTraversal(tree.rightNode);
	}
	
	public void inOrderTraversal(BinaryTreeNode tree) {
		if(tree == null) {
			return;
		}
		inOrderTraversal(tree.leftNode);
		System.out.print(tree.data + " - ");
		inOrderTraversal(tree.rightNode);
	}
	
	public void postOrderTraversal(BinaryTreeNode tree) {
		if(tree == null) {
			return;
		}
		postOrderTraversal(tree.leftNode);
		
		postOrderTraversal(tree.rightNode);
		
		System.out.print(tree.data + " - ");
	}
	
	public static void main(String[] args) {
		BinaryTreeTravelsal btt = new BinaryTreeTravelsal();
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.leftNode = new BinaryTreeNode(2);
		root.rightNode = new BinaryTreeNode(3);
		root.leftNode.leftNode = new BinaryTreeNode(4);
		root.leftNode.rightNode = new BinaryTreeNode(5);
		root.rightNode.leftNode = new BinaryTreeNode(6);
		root.rightNode.rightNode = new BinaryTreeNode(7);
		
		System.out.println("\n PreOrder:: ");
		btt.preOrderTraversal(root);
		
		System.out.println("\n InOrder:: ");
		btt.inOrderTraversal(root);
		
		System.out.println("\n PostOrder:: ");
		btt.postOrderTraversal(root);
		
	}
}
