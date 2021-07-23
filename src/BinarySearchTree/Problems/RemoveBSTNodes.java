package BinarySearchTree.Problems;

public class RemoveBSTNodes {
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
    RemoveBSTNodes(int key)
	{
		root = new Node(key);
	}

	RemoveBSTNodes()
	{
		root = null;
	}

    private static Node removeBSTNodesOutsideRange(Node node, int low, int high) {
        if(node == null) return null;

        node.left = removeBSTNodesOutsideRange(node.left, low, high);
        node.right = removeBSTNodesOutsideRange(node.right, low, high);

        if(node.key < low) return node.right;
        else if(node.key > high) return node.left;
        
        return node;
    }

    private static void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }
    public static void main(String[] args){
        RemoveBSTNodes a = new RemoveBSTNodes();

        a.root = a.new Node(8);
        a.root.left = a.new Node(6);
        a.root.left.left = a.new Node(2);
        a.root.left.left.right = a.new Node(5);
        a.root.left.left.right.left = a.new Node(3);
        a.root.right = a.new Node(15);
        a.root.right.right = a.new Node(20);
        a.root.right.left = a.new Node(12);

        a.root = removeBSTNodesOutsideRange(a.root,4,12);

        inOrder(a.root);
    }

}
