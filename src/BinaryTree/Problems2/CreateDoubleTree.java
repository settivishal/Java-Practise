package BinaryTree.Problems2;

//! Create Double tree of given Binary Tree
//* Solution: 
//* - We'll solve in post order manner
//* - Once we reach leftest node, we'll create a new node of node value
//* - Now, left of new node will point to left of original node
//* - Left of original node will point to new node

public class CreateDoubleTree {
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
    CreateDoubleTree(int key)
	{
		root = new Node(key);
	}

	CreateDoubleTree()
	{
		root = null;
	}

     static CreateDoubleTree a = new CreateDoubleTree();

    private static void createDoubleTree(Node node) {
        if(node == null) return;

        createDoubleTree(node.left);
        createDoubleTree(node.right);

        Node newNode = a.new Node(node.key);
        newNode.left = node.left;
        node.left = newNode;
    }

    private static void postOrder(Node node) {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args){
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        createDoubleTree(a.root);
        postOrder(a.root);
    }

    
}
