package BinarySearchTree.Problems;

import java.util.ArrayList;
import java.util.List;

//! Check if elements of two BST are same
//* Solution
//* - Traverse both BST in inorder manner & store values in sepearate list
//* - Now check if two list are same or not. 
//* - If both list have same size & have same element, then return true else false. 

//* Time Complexity: O(n)
//* Space Complexity: O(n)

public class CheckBSTElements {
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
    CheckBSTElements(int key)
	{
		root = new Node(key);
	}

	CheckBSTElements()
	{
		root = null;
	}

    private static boolean checkBSTElements(Node node1, Node node2) {
        if(node1 == null && node2 == null) return true;

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        inOrder(node1,l1);
        inOrder(node2,l2);
        return l1.equals(l2);
    }

    private static void inOrder(Node node, List<Integer> l) {
        if(node == null) return;

        inOrder(node.left, l);
        l.add(node.key);
        inOrder(node.right, l);
    }

    public static void main(String[] args){
        CheckBSTElements a = new CheckBSTElements();
        CheckBSTElements b = new CheckBSTElements();

        a.root = a.new Node(8);
        a.root.left = a.new Node(6);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(7);
        a.root.right = a.new Node(15);
        a.root.right.right = a.new Node(20);

        b.root = b.new Node(7);
        b.root.left = b.new Node(6);
        b.root.left.left = b.new Node(2);
        b.root.right = b.new Node(15);
        b.root.right.right = b.new Node(20);
        b.root.right.left = b.new Node(8);

        System.out.print(checkBSTElements(a.root, b.root));
    }

}
