package BinaryTree.Problems2;

//! Get Diameter of Binary Tree | Get max distance between any two leaf nodes
//* Solution: 
//* - We'll recursively go to left then right & on each step, we'll calculate height & will update diameter on every step
//* - Whenever 'left height + right height + 1' height is greater than diameter then update the diameter

//* - Time Complexity: O(n) 
//* - Space Complexity: O(1)

public class GetDiameter {
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
    GetDiameter(int key)
	{
		root = new Node(key);
	}

	GetDiameter()
	{
		root = null;
	}

    int diameter;
    private int getDiameter(Node node) {
        if(node == null) return 0;

        if(node.left == null && node.right == null) return 1;

        int lh = getDiameter(node.left);
        int rh = getDiameter(node.right);

        diameter = Math.max(diameter,lh+rh+1);

        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args){
        GetDiameter a = new GetDiameter();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(11);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        a.getDiameter(a.root);
        System.out.print(a.diameter);
    }
}
