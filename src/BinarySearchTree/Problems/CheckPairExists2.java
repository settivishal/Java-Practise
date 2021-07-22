package BinarySearchTree.Problems;

import java.util.HashSet;
import java.util.Set;

//! Check if there exists a pair for given Sum in BST Using Set(Preorder)
//* Solution 
//* - Traverse BST in preorder manner
//* - Initialize a Haseset
//* - For any node, check if sum - node.data present in set or not
//* - If it present, return true, else add current node value in set
//* - Traverse every node in tree & check above

//* Time Complexity: O(n)
//* Space Complexity: O(n)

public class CheckPairExists2 {
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
    CheckPairExists2(int key)
	{
		root = new Node(key);
	}

	CheckPairExists2()
	{
		root = null;
	}

    private static boolean checkPairExistsUsingSet(Node node, int val) {
        if(node == null) return false;
        Set<Integer> s = new HashSet<>();
        return checkPairExistsUsingSetUtil(node,s,val);
    }

    private static boolean checkPairExistsUsingSetUtil(Node node, Set<Integer> s,int val) {
        if(node == null) return false;

        if(s.contains(val - node.key)) return true;;
        
        s.add(node.key);

        if(checkPairExistsUsingSetUtil(node.left, s, val)) return true;

        return checkPairExistsUsingSetUtil(node.right, s, val);
    }

    public static void main(String[] args){
        CheckPairExists2 a = new CheckPairExists2();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(checkPairExistsUsingSet(a.root,27));
    }

}
