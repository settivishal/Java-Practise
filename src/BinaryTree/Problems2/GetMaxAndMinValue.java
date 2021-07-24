package BinaryTree.Problems2;

//! Find Maximum or Minimum Value in Binary Tree
//* - We'll solve this in preorder manner & at each step, check if current value is greater than maximum then update the max value & current value is less than minimum value then update the minimum value. 

//* - Time Complexity: O(n) 
//* - Space Complexity: O(1)

public class GetMaxAndMinValue {
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
    GetMaxAndMinValue(int key)
	{
		root = new Node(key);
	}

	GetMaxAndMinValue()
	{
		root = null;
	}
    
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    private void findMinMax(Node node) {
        if(node == null) return;

        if(node.key < minValue) minValue = node.key;

        if(node.key > maxValue) maxValue = node.key;

        findMinMax(node.left);
        findMinMax(node.right);
    }
    public static void main(String[] args){
        GetMaxAndMinValue a = new GetMaxAndMinValue();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        a.findMinMax(a.root);
        System.out.println(a.minValue);
        System.out.println(a.maxValue);
    }
}
