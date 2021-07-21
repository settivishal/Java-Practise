package BinarySearchTree.Problems;

public class GetSiblingNode {
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
    GetSiblingNode(int key)
	{
		root = new Node(key);
	}

	GetSiblingNode()
	{
		root = null;
	}

    private static Node getSiblingNode(Node node, int val) {
        if(node == null) return null;

        Node parent = null;
        while(node != null){
            if(val < node.key){
                parent = node;
                node = node.left;
            }else if(val > node.key){
                parent = node;
                node = node.right;
            }else{
                break; 
            }
        }
        Node sibling = parent.left.key == val ? parent.right : parent.left;
        return sibling;
    }

    public static void main(String[] args){
        GetSiblingNode a = new GetSiblingNode();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node ans = getSiblingNode(a.root, 13);
        if(ans != null) System.out.print(ans.key);
        else System.out.print("No sibling node");
    }
}
