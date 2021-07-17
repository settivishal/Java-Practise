package BinaryTree.Problems2;

//! Check if Two Trees are Mirror to each other
//* Solution: 
//* - We need to check the value of both trees node at a time & then recursively call for remaining nodes
//* - Recursively check left of 1st tree with right of 2nd tree & similarly right of 1st tree with left of 2nd tree

public class CheckMirror {
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
    CheckMirror(int key)
	{
		root = new Node(key);
	}

	CheckMirror()
	{
		root = null;
	}

    private static boolean checkMirror(Node node1,Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        return node1.key == node2.key && checkMirror(node1.left, node2.right) && checkMirror(node1.right, node2.left);

    }

    public static void main(String[] args){
        CheckMirror a = new CheckMirror();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        CheckMirror b = new CheckMirror();
        b.root = b.new Node(2);
        b.root.right = b.new Node(7);
        b.root.right.right = b.new Node(2);
        b.root.right.left = b.new Node(6);
        b.root.right.left.right = b.new Node(5);
        b.root.right.left.left = b.new Node(11);
        b.root.left = b.new Node(5);
        b.root.left.left = b.new Node(9);
        b.root.left.left.right = b.new Node(4);

        System.out.print(checkMirror(a.root,b.root));
    }
}

    
