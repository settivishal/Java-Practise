package BinaryTree.Problems;

public class NoOfLeafNodes {
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
    NoOfLeafNodes(int key)
	{
		root = new Node(key);
	}

	NoOfLeafNodes()
	{
		root = null;
	}
    
    private static int countLeafNodes(Node node) {
        if(node == null) return 0;

        if(node.left == null && node.right == null) return 1;
        
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public static void main(String[] args){
        NoOfLeafNodes a = new NoOfLeafNodes();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.println(countLeafNodes(a.root));
    }

}
