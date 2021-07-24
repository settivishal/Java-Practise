package BinaryTree.Problems2;

//! Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children.
//* Input: root = [1,2,3,null,5]
//* Output: ["1->2->5","1->3"]

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    Node root;

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    BinaryTreePaths(int key)
	{
		root = new Node(key);
	}

	BinaryTreePaths()
	{
		root = null;
	}

    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<String>();
        binaryTreePathsUtil(root,"",ans);
        return ans;
    }
    
    public void binaryTreePathsUtil(Node node, String path, List<String> ans){
        if(node.left == null && node.right == null) ans.add(path+node.key);
        if(node.left != null) binaryTreePathsUtil(node.left,path+node.key+"->",ans);
        if(node.right != null) binaryTreePathsUtil(node.right,path+node.key+"->",ans);
    } 
    public static void main(String[] args){
        BinaryTreePaths a = new BinaryTreePaths();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.println(a.binaryTreePaths(a.root));
    }
}
