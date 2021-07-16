package BinaryTree.Problems;

public class LeftView {
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
    LeftView(int key)
	{
		root = new Node(key);
	}

	LeftView()
	{
		root = null;
	}
    
    static int maxLevel = 0;
    private static void printLeftView(Node root2, int level) {
        if(root2 == null) return;

        if(level >= maxLevel){
            System.out.print(root2.key+ " ");
            maxLevel++;
        }

        printLeftView(root2.left, level+1);
        printLeftView(root2.right, level+1);
    }

    public static void main(String[] args){
        LeftView a = new LeftView();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        printLeftView(a.root,0);
    }

}
