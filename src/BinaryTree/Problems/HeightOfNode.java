package BinaryTree.Problems;

public class HeightOfNode {
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

    HeightOfNode(int key)
	{
		root = new Node(key);
	}

	HeightOfNode()
	{
		root = null;
	}
    
    private static int getHeight(Node node) {
        if(node == null) return -1;


        return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
    }

    public static void main(String[] args){
        HeightOfNode a = new HeightOfNode();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.println(getHeight(a.root));
    }

}
