package BinaryTree.Problems2;

//! Check if Two Binary Trees have same Structure
//* Solution: 
//* - We need to check the structure of both trees node at a time & then recursively call for remaining nodes
//* - Recursively check left of 1st tree with left of 2nd tree & similarily right of 1st tree with right of 2nd tree
//* - If both nodes are null, return true, if any one node is null, return false

public class CheckSameStructure {
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
    CheckSameStructure(int key)
	{
		root = new Node(key);
	}

	CheckSameStructure()
	{
		root = null;
	}

    private static boolean checkSameStructure(Node node1,Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        return checkSameStructure(node1.left, node2.left) && checkSameStructure(node1.right, node2.right);
    }

    private static void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void main(String[] args){
        CheckSameStructure a = new CheckSameStructure();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        CheckSameStructure b = new CheckSameStructure();
        b.root = b.new Node(4);
        b.root.left = b.new Node(8);
        b.root.left.left = b.new Node(12);
        b.root.left.right = b.new Node(5);
        b.root.left.right.left = b.new Node(90);
        b.root.left.right.right = b.new Node(44);
        b.root.right = b.new Node(67);
        b.root.right.right = b.new Node(39);
        b.root.right.right.left = b.new Node(41);

        inOrder(a.root);
        System.out.println();
        inOrder(b.root);
        System.out.println();
        System.out.print(checkSameStructure(a.root,b.root));
    }
}
