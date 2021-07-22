package BinarySearchTree.Problems;

public class KthLargestElement {
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
    KthLargestElement(int key)
	{
		root = new Node(key);
	}

	KthLargestElement()
	{
		root = null;
	}

    static int count = 0;
    private static Node kthLargestElement(Node node, int val) {
        if(node == null) return null;

        Node right = kthLargestElement(node.right, val);

        if(right != null) return right;

        count++;
        if(count == val) return node;

        return kthLargestElement(node.left, val);
    }

    public static void main(String[] args){
        KthLargestElement a = new KthLargestElement();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node ans = kthLargestElement(a.root, 4);
        System.out.print(ans.key);
    }

}