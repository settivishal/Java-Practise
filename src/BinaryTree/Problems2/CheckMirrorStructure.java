package BinaryTree.Problems2;

//! Check if Two Trees are Mirror Structure to each other
//* Solution: 
//* - We need to check the structure of both trees node at a time & then recursively call for remaining nodes
//* - Recursively check left of 1st tree with right of 2nd tree & similarily right of 1st tree with left of 2nd tree

public class CheckMirrorStructure {
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
    CheckMirrorStructure(int key)
	{
		root = new Node(key);
	}

	CheckMirrorStructure()
	{
		root = null;
	}

    private static boolean checkMirrorStructure(Node node1,Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        return checkMirrorStructure(node1.left, node2.right) && checkMirrorStructure(node1.right, node2.left);
    }

    private static void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void main(String[] args){
        CheckMirrorStructure a = new CheckMirrorStructure();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        CheckMirrorStructure b = new CheckMirrorStructure();
        b.root = b.new Node(2);
        b.root.right = b.new Node(49);
        b.root.right.right = b.new Node(12);
        b.root.right.left = b.new Node(6);
        b.root.right.left.right = b.new Node(5);
        b.root.right.left.left = b.new Node(18);
        b.root.left = b.new Node(60);
        b.root.left.left = b.new Node(9);
        b.root.left.left.right = b.new Node(40);

        inOrder(a.root);
        System.out.println();
        inOrder(b.root);
        System.out.println();
        System.out.print(checkMirrorStructure(a.root,b.root));
    }
}

    
