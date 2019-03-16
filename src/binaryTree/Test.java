package binaryTree;

public class Test {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7};
		BinaryTree binaryTree = new BinaryTree();
		TreeNode root = binaryTree.createBinTree(array);
		
		//先序遍历
		System.out.println("preOrder:");
		PreOrder.preOrder(root);
		
		//中序遍历
		System.out.println("\n"+"inorder:");
		InOrder.inOrder(root);
		
		//后序遍历
		System.out.println("\n"+"postorder:");
		PostOrder.postOrder(root);
		
		//BFS层序遍历
		System.out.println("\n"+"BFS:");
		BFS.bfs(root);
		
		//BFS层序遍历
		System.out.println("\n"+"DFS:");
		DFS.dfs(root);
	}
}
