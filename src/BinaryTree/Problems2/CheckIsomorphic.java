package BinaryTree.Problems2;

//* Solution: 
//* - We need to check, if i move a node to left or right & it's matching with other tree
//* - So other subtree can be same structure or mirror structure, then it's mirror structure 
//* - Recursively check left-left & right-right of both tree or check left-right & right-left
//* - If both nodes are null, return true, if any one node is null, return false

public class CheckIsomorphic {
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
    CheckIsomorphic(int key)
	{
		root = new Node(key);
	}

	CheckIsomorphic()
	{
		root = null;
	}

    private static boolean checkIsomorphic(Node node1,Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 == null || node2 == null) return false;

        if(node1.key != node2.key) return false;

        return checkIsomorphic(node1.left, node2.left) && checkIsomorphic(node1.right, node2.right)
            || checkIsomorphic(node1.right, node2.left) && checkIsomorphic(node1.left, node2.right);
    }

    public static void main(String[] args){
        CheckIsomorphic a = new CheckIsomorphic();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(9);
        a.root.right = a.new Node(5);

        CheckIsomorphic b = new CheckIsomorphic();
        b.root = b.new Node(2);
        b.root.right = b.new Node(5);
        b.root.left = b.new Node(7);
        b.root.left.right = b.new Node(9);

        System.out.print(checkIsomorphic(a.root,b.root));
    }
}

