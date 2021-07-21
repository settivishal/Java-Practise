package BinarySearchTree.Problems;

//!  Get Inorder Successor of a given value in Binary Search Tree

public class GetInorderSuccesor {
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
    GetInorderSuccesor(int key)
	{
		root = new Node(key);
	}

	GetInorderSuccesor()
	{
		root = null;
	}

    private static Node getInorderSuccessor(Node node, int val) {
        if(node == null) return null;

        Node inordersuccesor = null;
        while(node != null){
            if(val < node.key){
                inordersuccesor = node;
                node = node.left;
            }else if(val > node.key){
                node = node.right;
            }else{
                if(node.right != null)
                    inordersuccesor = getSuccessor(node);
                break;
            }
        }
        return inordersuccesor;
    }

    private static Node getSuccessor(Node node) {
        if(node == null) return null;

        Node temp = node.right;
        while(temp.left != null)
            temp = temp.left;
        return temp;
    }

    public static void main(String[] args){
        GetInorderSuccesor a = new GetInorderSuccesor();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node ans = getInorderSuccessor(a.root, 7);
        if(ans != null) System.out.print(ans.key);
        else System.out.print("No inorder successor");
    }
}
