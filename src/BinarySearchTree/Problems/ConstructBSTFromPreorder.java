package BinarySearchTree.Problems;

//! Create BST from given PreOrder Traversal
//* Solution
//* - The first element of Preorder array will contain the root element as it's preorder so create a node of this value
//* - Now traverse from start of array & find the value greater than node value which we just created
//* - Let's say we find the value at ith index
//* - Now all values from start + 1 to i - 1 will be in left sub tree & from i to end  will be in right subtree
//* - Again recursively call the function with node.left = create(arr, start + 1, i - 1) & node.right = create(arr, i, end)
//* - return node from function

//* Time Complexity: O(n), where n is total number of elements in array
//* Space Complexity: O(1)

public class ConstructBSTFromPreorder {
    Node root;

    static class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    ConstructBSTFromPreorder(int key)
	{
		root = new Node(key);
	}

	ConstructBSTFromPreorder()
	{
		root = null;
	}
    private Node constructBSTFromPreorder(int[] arr, int start, int end) {
        if(start > end) return null;

        Node node = new Node(arr[start]);

        // int i = getIndexLessValueThanNode(arr,node, start, end);
        int i;
        for (i = start+1; i <= end; i++) {
            if(arr[i] > node.key) break;
        }

        node.left = constructBSTFromPreorder(arr, start+1, i-1);
        node.right = constructBSTFromPreorder(arr, i, end);

        return node;
    }

    // private static int getIndexLessValueThanNode(int[] arr,Node node,int start, int end) {
    //     int i;
    //     for (i = arr.length-1; i >= 0; i--) {
    //         if(arr[i] < node.key) return i;
    //     }
    //     return i;
    // }

    private void preOrder(Node node) {
        if(node == null) return;

        System.out.print(node.key+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args){
        ConstructBSTFromPreorder a = new ConstructBSTFromPreorder();
        a.root = null;

        int[] preOrder = {10,4,2,8,5,9,15,12,20};
        a.root = a.constructBSTFromPreorder(preOrder,0,preOrder.length-1);

        a.preOrder(a.root);
    }

}