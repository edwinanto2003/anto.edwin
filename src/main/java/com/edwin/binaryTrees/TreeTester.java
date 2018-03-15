package com.edwin.binaryTrees;

import java.util.List;

public class TreeTester
{

	private TreeNode createBT()
	{
		BinaryTree bt = new BinaryTree(1);

		TreeNode root = bt.getRoot();

		bt.insertLeft(root, 2);
		bt.insertRight(root, 3);
		bt.insertRight(root.left, 5);

		return bt.getRoot();
	}

	private TreeNode createBSTIter()
	{
		BinarySearchTree bst = new BinarySearchTree();

		bst.insertIter(20);
		bst.insertIter(30);
		bst.insertIter(10);
		bst.insertIter(12);
		bst.insertIter(5);
		bst.insertIter(25);
		bst.insertIter(35);
		bst.insertIter(50);

		return bst.root;
	}

	private TreeNode createBSTRecur()
	{
		BinarySearchTree bst = new BinarySearchTree();

		bst.insertRecur(20);
		bst.insertRecur(30);
		bst.insertRecur(10);
		bst.insertRecur(12);
		bst.insertRecur(5);
		bst.insertRecur(25);
		bst.insertRecur(35);
		bst.insertRecur(50);

		return bst.root;
	}

	private void printBST(TreeNode node)
	{
		BinarySearchTree bst = new BinarySearchTree();

		System.out.println("InOrder traversal");
		bst.printInorder(node);

		System.out.println("Level Order traversal");
		bst.bfs(node);

		System.out.println("Level Order traversal- each level on new line");
		bst.printBFSseparateLine(node);

		System.out.println("Print min max at each level");
		List<Integer> minMax = bst.minMaxAtEachLevel(node);
		for (int i : minMax)
		{
			System.out.println(i);
		}

		System.out.println("Level order using dfs recursion");
		List<List<Integer>> levelOrderUsingDFS = bst.levelOrderBottom(node);
		for (List<Integer> list : levelOrderUsingDFS)
		{
			System.out.println(list);
		}

		System.out.println("Print the paths");
		BinaryTree bt = new BinaryTree();
		List<String> paths = bt.binaryTreePaths(node);

		for (String path : paths)
			System.out.println(path);
	}



	public static void main(String[] args)
	{
		TreeTester tt = new TreeTester();

		//	TreeNode bstRoot = tt.createBSTIter();
		//	TreeNode bstRoot = tt.createBSTRecur();
		TreeNode bstRoot = tt.createBT();
		System.out.println("tree created");

		tt.printBST(bstRoot);


	}

}
