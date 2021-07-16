package BinaryTree.Problems;

//! Print elements in Level order Using Recursion

public class ReverseLevelOrderTraversal {
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
    ReverseLevelOrderTraversal(int key)
	{
		root = new Node(key);
	}

	ReverseLevelOrderTraversal()
	{
		root = null;
	}

    private static void levelOrderTraversal(Node node) {
        if(node == null) return;

        int height = getHeightOfTree(node);

        for(int i = height; i >= 0; i--){
            printAtGivenLevel(node,i+1);
            System.out.println();
        }
    }

    private static void printAtGivenLevel(Node node, int l) {
        if(node == null) return;

        if(l == 1){
            System.out.print(node.key+" ");
            return;
        }

        printAtGivenLevel(node.left, l-1);
        printAtGivenLevel(node.right, l-1);
    }

    private static int getHeightOfTree(Node node) {
        if(node == null) return -1;

        return Math.max(getHeightOfTree(node.left),getHeightOfTree(node.right)) + 1;
    }

    public static void main(String[] args){
        ReverseLevelOrderTraversal a = new ReverseLevelOrderTraversal();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        levelOrderTraversal(a.root);
    }

}
