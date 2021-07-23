package BinarySearchTree.Problems;

//! Find the closest element for a given value in BST
//* Solution
//* - We'll take 3 variable, currentDiff, minDiff, closetElementDiff
//* - We'll start from root & get the difference of node value & given value
//* - If currentDiff & less than minDiff, update the minDiff & update the closestMinDiffNode to current node
//* - If value is less than current value, go to left side
//* - If value is greater than current value, go to right side
//* - If value is equal to current value, break the loop
//* - Return the closestMinDiffNode as answer

//* Time Complexity: O(h), where h is height of BST
//* Space Complexity: O(1)

public class GetClosestNode {
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
    GetClosestNode(int key)
	{
		root = new Node(key);
	}

	GetClosestNode()
	{
		root = null;
	}

    private Node getClosestNode(Node node, int val) {
        if(node == null) return null;

        int minDiff = Integer.MAX_VALUE;
        Node minDiffNode = null;

        while(node != null){
            int currDiff = Math.abs(node.key - val);

            if(currDiff < minDiff){
                minDiff = currDiff;
                minDiffNode = node;
            }

            if(val < node.key) node = node.left;
            else if(val > node.key) node = node.right;
            else break;
        }
        return minDiffNode;
    }

    public static void main(String[] args){
        GetClosestNode a = new GetClosestNode();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node node = a.getClosestNode(a.root,5);
        if(node != null) System.out.print(node.key);
    }

}
