package BinaryTree.Problems2;

//! Check if given Binary Tree is Height Balanced Tree
//* Solution: 
//* - We'll recursively go to left then right & on each step, we'll calculate left height & right height 
//* - Whenever difference of left height & right height is greater than 1 then it's not balanced tree, In this case, we'll return -1.
//* - Else we'll return Math.max(left, right) + 1

//* - Time Complexity: O(n) 
//* - Space Complexity: O(1)

public class CheckBTHeightBalanced {
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
    CheckBTHeightBalanced(int key)
	{
		root = new Node(key);
	}

	CheckBTHeightBalanced()
	{
		root = null;
	}

    private int checkBTHeightBalanced(Node node) {
        if(node == null) return 0;

        if(node.left == null && node.right == null) return 1;

        int lh = checkBTHeightBalanced(node.left);
        int rh = checkBTHeightBalanced(node.right);

        if(lh == -1 || rh == -1 || Math.abs(lh-rh) > 1) return -1;

        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args){
        CheckBTHeightBalanced a = new CheckBTHeightBalanced();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        // a.root.right.left = a.new Node(45);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        if(a.checkBTHeightBalanced(a.root) == -1) System.out.print("BST not height balanced");
        else System.out.print("BST height balanced");
    }
}
