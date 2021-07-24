package BinarySearchTree.Problems;

//! Check if given Binary Tree is BST
//* Solution: 
//* - We traverse the binary tree in inorder manner
//* - We take a global variable 'prev'.
//* - Now whenever we're traversing any node, we check node value with previous node value
//* - If current node value is less than previous value, we return false, else we keep on checking. 
//* - We check this for all nodes in tree

//* Time Complexity: O(n)
//* Space Complexity: O(1)


public class CheckIfBST {
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
    CheckIfBST(int key)
	{
		root = new Node(key);
	}

	CheckIfBST()
	{
		root = null;
	}
    static Node prev = null;
    private static boolean checkBSTValidity(Node node) {
        if(node == null) return true;

        if(!checkBSTValidity(node.left)) return false;

        if(prev != null && node.key < prev.key) return false;

        prev  = node;

        return checkBSTValidity(node.right);
    }

    //* --------Alternate---------
    public boolean isValidBST(Node root) {
        return isValidBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    public boolean isValidBSTUtil(Node root, int min, int max){
        if(root == null) return true;
        
        if(root.key >= max || root.key <= min) return false;
        
        return isValidBSTUtil(root.left,min,root.key) && 
            isValidBSTUtil(root.right,root.key,max);
    }
    //*----------------------------

    public static void main(String[] args){
        CheckIfBST a = new CheckIfBST();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.println(checkBSTValidity(a.root));
        System.out.println(a.isValidBST(a.root));
    }

}
