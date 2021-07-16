package BinaryTree.Problems;

public class MirrorBinaryTree {
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
    MirrorBinaryTree(int key)
	{
		root = new Node(key);
	}

	MirrorBinaryTree()
	{
		root = null;
	}
    
    private static Node mirrorBinaryTree(Node node) {
        if(node == null) return null;

        Node t = node.left;
        node.left = node.right;
        node.right = t;

        mirrorBinaryTree(node.left);
        mirrorBinaryTree(node.right);

        return node;
    }
    
    private static void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void main(String[] args){
        MirrorBinaryTree a = new MirrorBinaryTree();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        Node mirror = mirrorBinaryTree(a.root);
        inOrder(mirror);
    }


}
