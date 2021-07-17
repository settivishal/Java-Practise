package BinaryTree.Problems2;

public class CheckFoldable {
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
    CheckFoldable(int key)
	{
		root = new Node(key);
	}

	CheckFoldable()
	{
		root = null;
	}

    private static boolean checkFoldable(Node node) {
        if(node == null) return true;

        return checkMirror(node.left,node.right);
    }

    private static boolean checkMirror(Node node1, Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        return checkMirror(node1.left, node2.right) && checkMirror(node1.right, node2.left);
    }

    public static void main(String[] args){
        CheckFoldable a = new CheckFoldable();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);

        System.out.print(checkFoldable(a.root));
    }
}
