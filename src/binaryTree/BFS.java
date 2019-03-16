package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void bfs(TreeNode root) {
		TreeNode temp;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			temp = queue.poll();
			System.out.print(temp.data+"\t");
			if(temp.left!=null) queue.offer(temp.left);
			if(temp.right!=null) queue.offer(temp.right);
		}
	}
}
