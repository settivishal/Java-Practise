package BinarySearchTree.Problems;

public class GetMaxNode {
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
    GetMaxNode(int key)
	{
		root = new Node(key);
	}

	GetMaxNode()
	{
		root = null;
	}

    private static int getMaxNode(Node node) {
        if(node == null) return -1;

        while(node.right != null) node = node.right; 
        return node.key;
    }
    public static void main(String[] args){
        GetMaxNode a = new GetMaxNode();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        System.out.print(getMaxNode(a.root));
    }
}
