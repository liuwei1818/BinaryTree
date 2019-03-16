package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
	
	private static List<TreeNode> nodeList = null;
	
	public TreeNode createBinTree(int[] array) {  
        nodeList = new LinkedList<TreeNode>();  
        // ��һ�������ֵ����ת��ΪNode�ڵ�  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new TreeNode(array[nodeIndex]));  
        }  
        // ��ǰlastParentIndex-1�����ڵ㰴�ո��ڵ��뺢�ӽڵ�����ֹ�ϵ����������  
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {  
            // ����  
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);  
            // �Һ���  
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);  
        }  
        // ���һ�����ڵ�:��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե����ó�������  
        int lastParentIndex = array.length / 2 - 1;  
        // ����  
        nodeList.get(lastParentIndex).left= nodeList.get(lastParentIndex * 2 + 1);  
        // �Һ���,�������ĳ���Ϊ�����Ž����Һ���  
        if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).right= nodeList.get(lastParentIndex * 2 + 2);  
        } 
        return nodeList.get(0);
    }  
}
