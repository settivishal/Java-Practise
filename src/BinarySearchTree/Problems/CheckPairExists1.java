package BinarySearchTree.Problems;

//! Check if there exists a pair for given Sum in BST Using Inorder
//* Solution - 2
//* - Traverse BST in inorder 
//* - While Traversing in inorder, keepon adding value as well in list as well
//* - After traversing, we'll have sorted array/list
//* - Now take two variable start & end, start will point to o index & end will point to last index
//* - Get sum of values present at start & end index
//* - If CurrentSum is equal to given sum, return true.
//* - If CurrentSum is less than given sum, increase start by 1.
//* - If CurrentSum is greater than given sum, decrese the end by 1

import java.util.ArrayList;

public class CheckPairExists1 {
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
    CheckPairExists1(int key)
	{
		root = new Node(key);
	}

	CheckPairExists1()
	{
		root = null;
	}
    
    static ArrayList<Integer> l = new ArrayList<>();

    private static boolean checkPairExistsUsingInorder(Node node, int val) {
        if(node == null) return false;

        getInorder(node,l);
        int start = 0;
        int end = l.size()-1;
        while(start < end){
            if(l.get(start)+l.get(end) < val) start++;
            else if(l.get(start)+l.get(end) > val) end--;
            else return true;
        }

        return false;
    }
    
    private static void getInorder(Node node, ArrayList<Integer> l) {
        if(node == null) return;

        getInorder(node.left, l);
        l.add(node.key);
        getInorder(node.right, l);
    }

    public static void main(String[] args){
        CheckPairExists1 a = new CheckPairExists1();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(checkPairExistsUsingInorder(a.root,28));
    }

}
