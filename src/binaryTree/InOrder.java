package binaryTree;

import java.util.Stack;

public class InOrder {
	public static void inOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(true) {
			while(root!=null) {
				stack.push(root);
				root = root.left;
			}
			if(stack.isEmpty()) break;
			root = stack.pop();
			System.out.print(root.data+"\t");
			root = root.right;
		}
	}
}
