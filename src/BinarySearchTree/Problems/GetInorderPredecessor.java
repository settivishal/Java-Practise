package BinarySearchTree.Problems;

//! Get Inorder Predecessor for a given value in BST
//*Solution
//* - Start traversal from root
//* - Take a Node variable inorderPredecessor
//* - If given value is less than current node, go to left side
//* - If given value is greater than current node, go to right side & update the inorderPredecessor
//* - Once node is equal to given value, we've two case:
//* - If node.left is null then return inorderPredecessor & break the loop
// *- If node.left is not null then go to temp = node.left & keep on going right until it's not null & break the loop
//* - At last return the inorderPredecessor variable

//* Time Complexity: O(h), where h is height of tree
//* Space Complexity: O(1)

public class GetInorderPredecessor {
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
    GetInorderPredecessor(int key)
	{
		root = new Node(key);
	}

	GetInorderPredecessor()
	{
		root = null;
	}

    private static Node getInorderPredecessor(Node node, int val) {
        if(node == null) return null;

        Node inorderPredecessor = null;
        while(node != null){
            if(val < node.key) node = node.left;
            else if(val > node.key){
                inorderPredecessor = node;
                node = node.right;
            }
            else{
                if(node.left != null){
                    inorderPredecessor = getPredecessor(node);
                }
                break;
            }
        }
        return node != null ? inorderPredecessor : null;
    }
    private static Node getPredecessor(Node node) {
        Node temp = node.left;

        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }

    private static void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.key+" ");
        inOrder(node.right);
    }

    public static void main(String[] args){
        GetInorderPredecessor a = new GetInorderPredecessor();

        a.root = a.new Node(8);
        a.root.left = a.new Node(3);
        a.root.left.left = a.new Node(1);
        a.root.left.right = a.new Node(6);
        a.root.left.right.left = a.new Node(4);
        a.root.left.right.right = a.new Node(7);
        a.root.right = a.new Node(10);
        a.root.right.right = a.new Node(14);
        a.root.right.right.left = a.new Node(13);

        Node ans = getInorderPredecessor(a.root,7);
        if(ans != null) System.out.print(ans.key);
        else System.out.print("No predecessor");
        System.out.println();

        inOrder(a.root);
    }

}
