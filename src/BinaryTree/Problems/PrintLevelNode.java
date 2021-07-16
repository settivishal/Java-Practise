package BinaryTree.Problems;

//! Print elements at given level in Binary Tree

public class PrintLevelNode {
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
    PrintLevelNode(int key)
	{
		root = new Node(key);
	}

	PrintLevelNode()
	{
		root = null;
	}
    
    private static void printLevelNodes(Node node, int l) {
        if(node == null) return;

        if(l == 1){
            System.out.print(node.key+" ");
        }

        printLevelNodes(node.left, l-1);
        printLevelNodes(node.right, l-1);
    }

    public static void main(String[] args){
        PrintLevelNode a = new PrintLevelNode();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printLevelNodes(a.root,2);
    }

}
