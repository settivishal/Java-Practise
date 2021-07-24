package BinaryTree.Problems2;

//! Sum of Left Leaves. Given the root of a binary tree, return the sum of all left leaves.
//* Input: root = [3,9,20,null,null,15,7]
//* Output: 24
//* Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

public class SumOfLeftLeaves {
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
    SumOfLeftLeaves(int key)
	{
		root = new Node(key);
	}

	SumOfLeftLeaves()
	{
		root = null;
	}
    
    int sum = 0;
    public int sumOfLeftLeaves(Node root) {
        return helper(root,false);
    }
    
    public int helper(Node root, boolean IsLeft){
        if(root == null) return 0;
        
        if(IsLeft && root.left == null && root.right == null) sum += root.key;
        
        helper(root.left,true);
        helper(root.right,false);
        
        return sum;
    }
    public static void main(String[] args){
        SumOfLeftLeaves a = new SumOfLeftLeaves();
        a.root = a.new Node(3);
        a.root.left = a.new Node(9);
        a.root.right = a.new Node(20);
        a.root.right.left = a.new Node(15);
        a.root.right.right = a.new Node(7);

        System.out.println(a.sumOfLeftLeaves(a.root));
    }
    
}
