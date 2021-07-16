package BinaryTree.Problems;

public class Traversals {
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
    Traversals(int key)
	{
		root = new Node(key);
	}

	Traversals()
	{
		root = null;
	}

    public static void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void preOrder(Node node){
        if(node == null) return;

        System.out.print(node.key+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args){
        Traversals a = new Traversals();

        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        inOrder(a.root);
        System.out.println();
        preOrder(a.root);
        System.out.println();
        postOrder(a.root);
    }
}
