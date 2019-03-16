package binaryTree;

import java.util.Stack;

public class DFS {
	public static void dfs(TreeNode root) {
		if(root==null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data+"\t");
			if(temp.right!=null) stack.push(temp.right);
			if(temp.left!=null) stack.push(temp.left);
		}
	}
}
