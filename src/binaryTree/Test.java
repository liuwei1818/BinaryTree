package binaryTree;

public class Test {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7};
		BinaryTree binaryTree = new BinaryTree();
		TreeNode root = binaryTree.createBinTree(array);
		
		//�������
		System.out.println("preOrder:");
		PreOrder.preOrder(root);
		
		//�������
		System.out.println("\n"+"inorder:");
		InOrder.inOrder(root);
		
		//�������
		System.out.println("\n"+"postorder:");
		PostOrder.postOrder(root);
		
		//BFS�������
		System.out.println("\n"+"BFS:");
		BFS.bfs(root);
		
		//BFS�������
		System.out.println("\n"+"DFS:");
		DFS.dfs(root);
	}
}
