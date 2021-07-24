package BinaryTree.Problems2;

//! Print Root To Leaf Every Path In Binary Tree
//* Solution: 
//* - We'll keep on adding the node value in array & whenever there is leaf node, we'll print the array starting from 0 to current index

//* - Time Complexity: O(n) 
//* - Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class PrintEveryPath {
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
    PrintEveryPath(int key)
	{
		root = new Node(key);
	}

	PrintEveryPath()
	{
		root = null;
	}

    //! ------------Main Solution----------
    public void printRootToLeaf(Node node) {
        if (node == null) {
            return;
        }

        int arr[] = new int[10];
        printRootToLeafImpl(node, arr, 0);
    }

    private void printRootToLeafImpl(Node node, int[] arr, int index) {
        if (node == null) {
            return;
        }

        arr[index] = node.key;

        if (node.left == null && node.right == null) {
            printArray(arr, index);
        }

        printRootToLeafImpl(node.left, arr, index + 1);
        printRootToLeafImpl(node.right, arr, index + 1);
    }

    private void printArray(int[] arr, int index) {
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //! -----------Best Alternate Solution-------------
    private static List<String> printEveryPath(Node node) {
        List<String> pathList = new ArrayList<>();
        printEveryPathUtil(node,"",pathList);
        return pathList;
    }
    private static void printEveryPathUtil(Node node, String path, List<String> pathList) {
        if(node.left == null && node.right == null) pathList.add(path+node.key);
        if(node.left != null) printEveryPathUtil(node.left,path+node.key+" ",pathList);
        if(node.right != null) printEveryPathUtil(node.right,path+node.key+" ",pathList);
    }

    public static void main(String[] args){
        PrintEveryPath a = new PrintEveryPath();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        a.printRootToLeaf(a.root);

        List<String> ans = printEveryPath(a.root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        
    }
}
