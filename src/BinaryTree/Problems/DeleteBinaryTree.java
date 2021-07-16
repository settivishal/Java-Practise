package BinaryTree.Problems;

//! Deleting binary tree in postorder manner

public class DeleteBinaryTree {
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
    DeleteBinaryTree(int key)
	{
		root = new Node(key);
	}

	DeleteBinaryTree()
	{
		root = null;
	}
    
    private static Node deleteBinaryTree(Node node) {
        if(node == null) return null;

        node.left = deleteBinaryTree(node.left);
        node.right = deleteBinaryTree(node.right);

        System.out.println("Deleting node: "+ node.key);
        node = null;
        return node;
    }

    public static void main(String[] args){
        DeleteBinaryTree a = new DeleteBinaryTree();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        deleteBinaryTree(a.root);
    }


}
