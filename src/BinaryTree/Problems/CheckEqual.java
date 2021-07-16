package BinaryTree.Problems;

//! Check if 2 binary tress are identical

public class CheckEqual {
    Node root1;
    Node root2;

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
    CheckEqual(int key)
	{
		root1 = new Node(key);
		root2 = new Node(key);
	}

	CheckEqual()
	{
		root1 = null;
		root2 = null;
	}
    
    private static boolean checkEqual(Node node1, Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        return node1.key == node2.key 
                && checkEqual(node1.left, node2.left) 
                && checkEqual(node1.right,node2.right);
    }
    public static void main(String[] args){
        CheckEqual a = new CheckEqual();
        a.root1 = a.new Node(2);
        a.root1.left = a.new Node(7);
        a.root1.left.left = a.new Node(2);
        a.root1.left.right = a.new Node(6);
        a.root1.left.right.left = a.new Node(5);
        a.root1.left.right.right = a.new Node(11);
        a.root1.right = a.new Node(5);
        a.root1.right.right = a.new Node(9);
        a.root1.right.right.left = a.new Node(4);
        
        a.root2 = a.new Node(2);
        a.root2.left = a.new Node(7);
        a.root2.left.left = a.new Node(2);
        a.root2.left.right = a.new Node(6);
        a.root2.left.right.left = a.new Node(5);
        a.root2.left.right.right = a.new Node(11);
        a.root2.right = a.new Node(5);
        a.root2.right.right = a.new Node(9);
        a.root2.right.right.left = a.new Node(4);

        System.out.print(checkEqual(a.root1,a.root2));
    }

}
