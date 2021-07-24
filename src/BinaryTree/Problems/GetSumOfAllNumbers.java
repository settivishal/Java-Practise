package BinaryTree.Problems;

public class GetSumOfAllNumbers {
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
    GetSumOfAllNumbers(int key)
	{
		root = new Node(key);
	}

	GetSumOfAllNumbers()
	{
		root = null;
	}

    private int getSumOfAllNodesFormed(Node node) {
        return getSumOfAllNodesFormedUtil(node,0);
    }
    private int getSumOfAllNodesFormedUtil(Node node, int sum) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return sum*10+node.key;

        return getSumOfAllNodesFormedUtil(node.left,sum*10+node.key) 
                + getSumOfAllNodesFormedUtil(node.right,sum*10+node.key);
    }

    public static void main(String[] args){
        GetSumOfAllNumbers a = new GetSumOfAllNumbers();
        a.root = a.new Node(2);
        a.root.left = a.new Node(7);
        a.root.left.left = a.new Node(2);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(5);
        a.root.left.right.right = a.new Node(1);
        a.root.right = a.new Node(5);
        a.root.right.right = a.new Node(9);
        a.root.right.right.left = a.new Node(4);

        System.out.print(a.getSumOfAllNodesFormed(a.root));;
    }
}
