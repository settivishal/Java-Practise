package BinarySearchTree.Problems;

//! Create BST from given PostOrder Traversal
//* Solution
//* - The last element of postorder array will contain the root element as it's postorder so create a node of this value
//* - Now traverse from last of array & find the value lesser than node value which we just created
//* - Let's say we find the value at ith index
//* - Now all values from start to i will be in left sub tree & from i + 1 to end - 1 will be in right subtree
//* - Again recursively call the function with node.left = create(arr, start, i) & node.right = create(arr, i+1, end-1)
//* - return node from function

//* Time Complexity: O(n), where n is total number of elements in array
//* Space Complexity: O(1)


public class ConstructBSTFromPostorder {
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
    ConstructBSTFromPostorder(int key)
	{
		root = new Node(key);
	}

	ConstructBSTFromPostorder()
	{
		root = null;
	}
    private Node constructBSTFromPostorder(int[] arr, int start, int end) {
        if(start > end) return null;

        Node node = new Node(arr[end]);

        // int i = getIndexLessValueThanNode(arr,node, start, end);
        int i;
        for (i = end-1; i >= start; i--) {
            if(arr[i] < node.key) break;
        }

        node.left = constructBSTFromPostorder(arr, start, i);
        node.right = constructBSTFromPostorder(arr, i+1, end-1);

        return node;
    }

    // private static int getIndexLessValueThanNode(int[] arr,Node node,int start, int end) {
    //     int i;
    //     for (i = arr.length-1; i >= 0; i--) {
    //         if(arr[i] < node.key) return i;
    //     }
    //     return i;
    // }

    private void postOrder(Node node) {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }

    public static void main(String[] args){
        ConstructBSTFromPostorder a = new ConstructBSTFromPostorder();
        a.root = null;

        int[] postOrder = {2,5,9,8,4,12,20,15,10};
        a.root = a.constructBSTFromPostorder(postOrder,0,postOrder.length-1);

        a.postOrder(a.root);
    }

}
