package binaryTree;

import java.util.Stack;

public class PreOrder {
	public static void preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		while(true) {
			while(root!=null) {
				System.out.print(root.data+"\t");
				stack.push(root);
				root = root.left;
			}
			if(stack.isEmpty()) break;
			root = stack.pop();
			root = root.right;
		}
	}
}
