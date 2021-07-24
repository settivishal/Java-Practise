package BinaryTree.Problems2;

//! Get Max Sum from Root To Leaf in Binary Tree
//* Solution: 
//* - We'll recursively go left & right & keep on adding the value in existing sum
//* - Whenever we reach at leaf node, we check if this value greater than max_sum, update the max_sum

//* - Time Complexity: O(n) 
//* - Space Complexity: O(1)

public class GetMaxSumRootToLeaf {
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
    GetMaxSumRootToLeaf(int key)
	{
		root = new Node(key);
	}

	GetMaxSumRootToLeaf()
	{
		root = null;
	}

    int maxSum;
    private void maxSumFromRootToLeaf(Node node,int sum) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null && sum+node.key > maxSum) {
            maxSum = sum+node.key;
            return;
        }

        maxSumFromRootToLeaf(node.left,sum+node.key);
        maxSumFromRootToLeaf(node.right,sum+node.key);
    }
    public static void main(String[] args){
        GetMaxSumRootToLeaf a = new GetMaxSumRootToLeaf();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        a.maxSumFromRootToLeaf(a.root,0);
        System.out.print(a.maxSum);
    }
}
