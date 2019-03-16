package binaryTree;

import java.util.Stack;

public class PostOrder {
	public static void postOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(true){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                if(stack.isEmpty()) return;
                
                if(null==stack.lastElement().right){
                    root=stack.pop();
                    System.out.print(root.data+"\t");
                    while(root==stack.lastElement().right){
                        System.out.print(stack.lastElement().data+"\t");
                        root=stack.pop();
                        if(stack.isEmpty()){
                            break;
                        }
                    }
                }
                
                if(!stack.isEmpty())
                    root=stack.lastElement().right;
                else
                    root=null;
            }
        }
    }
}
