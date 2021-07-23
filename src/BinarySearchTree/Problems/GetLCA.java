package BinarySearchTree.Problems;

//!  Find Lowest Common Ancestor (LCA) for given values in Binary Search Tree
//* Solution
//* - Traverse BST from root
//* - For a node, if node.data is less than both n1 & n2, then I should go in right direction to check LCA, so no*de = node.right
//* - For a node, if node.data is greater than both n1 & n2, then I should go in left direction to check LCA, so node = node.right
//* - else current node will be LCA

//* Time Complexity: O(n)
//* Space Complexity: O(1)

public class GetLCA {
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
    GetLCA(int key)
	{
		root = new Node(key);
	}

	GetLCA()
	{
		root = null;
	}

    private Node getLowestCommonAncestor(Node node, int n1, int n2) {
        if(node == null) return null;

        while(node != null){
            if(n1 < node.key && n2 < node.key) node = node.left;
            else if(n1 > node.key && n2 > node.key) node = node.right;
            else break;
        }
        return node;
    }

    public static void main(String[] args){
        GetLCA a = new GetLCA();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node node = a.getLowestCommonAncestor(a.root,4,6);
        if(node != null) System.out.print(node.key);
    }

}
