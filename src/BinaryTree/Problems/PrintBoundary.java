package BinaryTree.Problems;

//!  Solution: 
//* - We'll divide in into 4 subsets
//* - 1st will print root node
//* - 2nd will print non leaf left boundary nodes
//* - 3rd will print all leaf nodes
//* - 4th will print right side non leaf boundary nodes
//* Time Complexity: O(n)

public class PrintBoundary {
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
    PrintBoundary(int key)
	{
		root = new Node(key);
	}

	PrintBoundary()
	{
		root = null;
	}
    
    public static void printBoundary(Node node) {
        if (node != null) {
        System.out.print(node.key + " ");

        printBoundaryLeft(node.left);

        printLeaves(node.left);
        printLeaves(node.right);

        printBoundaryRight(node.right);
        }
    }

    public static void printBoundaryLeft(Node node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.print(node.key + " ");
            printBoundaryLeft(node.left);
        } else if (node.right != null) {
            System.out.print(node.key + " ");
            printBoundaryLeft(node.right);
        }   
    }

    public static void printLeaves(Node node) {
        if (node == null) {
            return;
        }

        printLeaves(node.left);

        if (node.left == null && node.right == null) {
            System.out.print(node.key + " ");
        }
        printLeaves(node.right);
    }

    public static void printBoundaryRight(Node node) {
        if (node == null) {
            return;
        }

        if (node.right != null) {
            printBoundaryRight(node.right);
            System.out.print(node.key + " ");
        } else if (node.left != null) {
            printBoundaryRight(node.left);
            System.out.print(node.key + " ");
        }
    }
    public static void main(String[] args){
        PrintBoundary a = new PrintBoundary();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printBoundary(a.root);
    }

    
}
