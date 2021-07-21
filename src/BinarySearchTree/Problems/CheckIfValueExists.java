package BinarySearchTree.Problems;

public class CheckIfValueExists {
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
    CheckIfValueExists(int key)
	{
		root = new Node(key);
	}

	CheckIfValueExists()
	{
		root = null;
	}

    private static boolean checkIfValueExists(Node node, int val) {
        if(node == null) return false;

        while(node != null){
            if(val < node.key) node = node.left;
            else if(val > node.key) node = node.right;
            else return true;
        }
        return false;
    }

    public static void main(String[] args){
        CheckIfValueExists a = new CheckIfValueExists();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(checkIfValueExists(a.root, -5));
    }
}
