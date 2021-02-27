package com.home.datasturctures;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {

	BinaryTreeNode root;

	public BinaryTreeNode generateBinarySearchTree(List<Integer> inputValues) {

		this.root = new BinaryTreeNode(inputValues.get(0));

		for (int i = 1; i < inputValues.size(); i++) {
			root = constructBSTTree(this.root, inputValues.get(i));
		}
		return root;
	}

	public BinaryTreeNode constructBSTTree(BinaryTreeNode tree, Integer inputValue) {

		if (tree == null) {
			tree = new BinaryTreeNode(inputValue);
		}else {

			if (tree.data >= inputValue) {
				tree.leftNode = constructBSTTree(tree.leftNode, inputValue);
			} else {
				tree.rightNode = constructBSTTree(tree.rightNode, inputValue);
			}
		}
		return tree;

	}

	public static void main(String[] args) {
		List<Integer> intLists = Arrays.asList(5, 8, 4, 3, 21, 89, 16, 42);
		BinarySearchTree bst = new BinarySearchTree();
		BinaryTreeNode treeObj = bst.generateBinarySearchTree(intLists);

		BinaryTreeTravelsal btt = new BinaryTreeTravelsal();
		System.out.println("INORDER:: ");
		btt.inOrderTraversal(treeObj);
		
		System.out.println("\nPREORDER:: ");
		btt.preOrderTraversal(treeObj);
		
		System.out.println("\nPOSTORDER:: ");
		btt.postOrderTraversal(treeObj);
	}

}
