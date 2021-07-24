package BinaryTree.Problems2;

//!  Check If Root to Leaf Sum matches for Given Sum in Binary Tree
//* Solution: 
//* - We'll return true if it's leaf node & value matches to given sum
//* - Else, we'll recursively go to left then right & on each step, we'll substract the current value from given sum 
//* - Else we'll return Math.max(left, right) + 1

//* - Time Complexity: O(n) 
//* - Space Complexity: O(1)

public class CheckIfSumMatches {
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
    CheckIfSumMatches(int key)
	{
		root = new Node(key);
	}

	CheckIfSumMatches()
	{
		root = null;
	}

    private boolean ifRootToLeafPathSumMatches(Node node, int sum) {
        if(node == null) return false;

        if(node.left == null && node.right == null && node.key == sum) return true;

        return ifRootToLeafPathSumMatches(node.left, sum - node.key) ||
                ifRootToLeafPathSumMatches(node.right, sum - node.key);
    }
    public static void main(String[] args){
        CheckIfSumMatches a = new CheckIfSumMatches();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(a.ifRootToLeafPathSumMatches(a.root,19));;
    }
}
