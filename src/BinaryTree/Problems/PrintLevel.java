package BinaryTree.Problems;

//! Print level of a given node

public class PrintLevel {
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
    PrintLevel(int key)
	{
		root = new Node(key);
	}

	PrintLevel()
	{
		root = null;
	}
    
    private static int printLevel(Node node, int key, int level) {
        if(node == null) return 0;

        int l;

        if(node.key == key){
            return level;
        }

        l = printLevel(node.left, key, level+1);

        if(l != 0){
            return l;
        }

        l = printLevel(node.right, key, level+1);

        return l;
    }
    public static void main(String[] args){
        PrintLevel a = new PrintLevel();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(printLevel(a.root,11,1));
    }

}
