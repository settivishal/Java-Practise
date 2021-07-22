package BinarySearchTree.Problems;

//!  Get Kth Smallest element in given Binary Search Tree (BST)
//* Solution
//* - Traverse BST in inorder manner
//* - Create a count variable
//* - We increase count when we hit a node
//* - We check if count is equal to k, then that is out kth smallest element
//* - If node is returning null, then k is greater then total node size

public class KthSmallestElement {
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
    KthSmallestElement(int key)
	{
		root = new Node(key);
	}

	KthSmallestElement()
	{
		root = null;
	}

    static int count = 0;
    private static Node kthSmallestElement(Node node, int val) {
        if(node == null) return null;

        Node left = kthSmallestElement(node.left, val);

        if(left != null) return left;

        count++;
        if(count == val) return node;

        return kthSmallestElement(node.right, val);
    }

    public static void main(String[] args){
        KthSmallestElement a = new KthSmallestElement();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node ans = kthSmallestElement(a.root, 7);
        System.out.print(ans.key);
    }

}
