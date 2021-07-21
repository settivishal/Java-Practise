package BinarySearchTree.Basic;

public class Searching {
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
    Searching(int key)
	{
		root = new Node(key);
	}

	Searching()
	{
		root = null;
	}
    // A utility function to search a given key in BST
    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
        return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public static void main(String[] args){
        Searching a = new Searching();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(a.search(a.root, 13));
    }

}
